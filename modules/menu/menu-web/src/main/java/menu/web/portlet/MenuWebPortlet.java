package menu.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import menu.web.constants.MenuWebPortletKeys;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AndrásMarton
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MenuWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MenuWebPortletKeys.MENUWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MenuWebPortlet extends MVCPortlet {

	List<String> list = new ArrayList<String>(); // TODO: A teszt listát lecserélni DrinkLocalService hívásokra

	/*
	public void addDrink(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException{
		list.add(request.getAttribute(drinkName));
	}*/

}