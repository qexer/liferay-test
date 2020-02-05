package menu.web.portlet;

import com.liferay.frontend.taglib.clay.servlet.taglib.display.context.SearchContainerManagementToolbarDisplayContext;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author AndrásMarton
 */

public class DrinkManagementToolbarDisplayContext
        extends SearchContainerManagementToolbarDisplayContext {

    public DrinkManagementToolbarDisplayContext(
            LiferayPortletRequest liferayPortletRequest,
            LiferayPortletResponse liferayPortletResponse,
            HttpServletRequest request, SearchContainer searchContainer) {

        super(
                liferayPortletRequest, liferayPortletResponse, request,
                searchContainer);
    }

    public PortletURL getSearchURL() {
        PortletURL searchURL = liferayPortletResponse.createRenderURL();

        searchURL.setParameter("mvcPath", "/view.jsp");
        searchURL.setParameter("redirect", getRedirect()); // TODO: ellenőrizni jó-e

        return searchURL;
    }

    private String getRedirect() {
        return PortalUtil.escapeRedirect(
                ParamUtil.getString(
                        request, "redirect",
                        PortalUtil.getCurrentURL(request)));
    }

    public List<DropdownItem> getFilterDropdownItems() { // TODO: setHref-ek beállítása
        /*return new DropdownItemList(request) {
            {
                addGroup(
                        dropdownGroupItem -> {
                            dropdownGroupItem.setDropdownItemList(
                                    new DropdownItemList(request) {
                                        {
                                            add(
                                                    dropdownItem -> {
                                                        dropdownItem.setHref("#price");
                                                        dropdownItem.setLabel("Price");
                                                    });
                                        }
                                    }
                            );
                            dropdownGroupItem.setLabel("Filter By");
                        });

                addGroup(
                        dropdownGroupItem -> {
                            dropdownGroupItem.setDropdownItemList(
                                    new DropdownItemList(request) {
                                        {
                                            add(
                                                    dropdownItem -> {
                                                        dropdownItem.setHref("#order1");
                                                        dropdownItem.setLabel("Order 1");
                                                    });

                                            add(
                                                    dropdownItem -> {
                                                        dropdownItem.setHref("#order2");
                                                        dropdownItem.setLabel("Order 2");
                                                    });
                                        }
                                    }
                            );
                            dropdownGroupItem.setLabel("Order By");
                        });
            }
        };*/
        return new DropdownItemList(){}; // TODO: gatyába rázni ezt a listát
    }

   /* @Override
    protected String[] getNavigationKeys() {
        return new String[] {"all"};
    }

    @Override
    protected String[] getOrderByKeys() {
        return new String[] {"drinkID"};
    }*/
}
