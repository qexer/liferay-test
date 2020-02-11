package menucard.portlet;

import card.model.Drink;
import card.service.DrinkLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import menucard.constants.MenucardFrontendPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author AndrásMarton
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MenucardFrontend",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MenucardFrontendPortletKeys.MENUCARDFRONTEND,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MenucardFrontendPortlet extends MVCPortlet {

	public DrinkLocalService getDrinkLocalService(){
		return drinkLocalService;
	}

	@Override
	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		try {
			String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

			if (cmd.equals(Constants.ADD) || cmd.equals(Constants.UPDATE)) {
				updateDrink(actionRequest);
			}
			else if (cmd.equals(Constants.DELETE)) {
				deleteDrink(actionRequest);
			}

			if (Validator.isNotNull(cmd)) {
				if (SessionErrors.isEmpty(actionRequest)) {
					SessionMessages.add(actionRequest, "requestProcessed");
				}

				String redirect = ParamUtil.getString(
						actionRequest, "redirect");

				actionResponse.sendRedirect(redirect);
			}
		}
		catch (Exception e) {
			throw new PortletException(e);
		}
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws IOException, PortletException {

		//set service bean
		request.setAttribute("drinkLocalService", getDrinkLocalService());

		super.render(request, response);
	}

	protected void deleteDrink(ActionRequest actionRequest) throws Exception {
		long drinkId = ParamUtil.getLong(actionRequest, "drinkId");

		getDrinkLocalService().deleteDrink(drinkId);
	}

	protected void updateDrink(ActionRequest actionRequest) throws Exception {
		long drinkId = ParamUtil.getLong(actionRequest, "drinkId");

		String name = ParamUtil.getString(actionRequest, "name");
		int price = ParamUtil.getInteger(actionRequest, "price");
		String description = ParamUtil.getString(actionRequest, "description");

		if (drinkId <= 0) {
			/*Drink drink = getDrinkLocalService().createDrink(0);

			drink.setName(name);
			drink.setPrice(price);
			drink.setDescription(description);
			drink.isNew();

			getDrinkLocalService().addDrink(drink);*/
			getDrinkLocalService().addDrink(name,price,description);
		}
		else {
			Drink drink = getDrinkLocalService().fetchDrink(drinkId);

			drink.setDrinkId(drinkId);
			drink.setName(name);
			drink.setPrice(price);
			drink.setDescription(description);

			getDrinkLocalService().updateDrink(drink);
		}
	}

	@Reference
	private volatile DrinkLocalService drinkLocalService;
}