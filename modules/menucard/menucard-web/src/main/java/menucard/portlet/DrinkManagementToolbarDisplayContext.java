package menucard.portlet;

import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;

import javax.servlet.http.HttpServletRequest;

public class DrinkManagementToolbarDisplayContext {

    public DrinkManagementToolbarDisplayContext(
            HttpServletRequest httpServletRequest,
            LiferayPortletResponse liferayPortletResponse) {

        _httpServletRequest = httpServletRequest;
        _liferayPortletResponse = liferayPortletResponse;

    }

    private final HttpServletRequest _httpServletRequest;
    private final LiferayPortletResponse _liferayPortletResponse;

}
