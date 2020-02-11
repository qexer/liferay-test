<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="javax.portlet.ActionURL" %><%--
  Created by IntelliJ IDEA.
  User: AndrásMarton
  Date: 2020. 02. 10.
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/init.jsp" %>

<%
    String redirect = ParamUtil.getString(request, "redirect");

    long drinkId = ParamUtil.getLong(request, "drinkId");
    Drink drink = null;

    if (drinkId > 0) {
        try {
            drink = drinkLocalService.getDrink(drinkId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }

    PortletURL portletURL = renderResponse.createRenderURL();
    String currentURL = portletURL.toString();
%>
<aui:form action="<%= (ActionURL)renderResponse.createActionURL() %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (drink == null) ? Constants.ADD : Constants.UPDATE %>" />
    <aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
    <aui:input name="drinkId" type="hidden" value="<%= drinkId %>" />

    <liferay-ui:header
            backURL="<%= redirect %>"
            title='<%= (drink != null) ? drink.getName() : "New Drink" %>'
    />

    <liferay-ui:asset-categories-error />

    <liferay-ui:asset-tags-error />

    <aui:model-context bean="<%= drink %>" model="<%= Drink.class %>" />

    <aui:fieldset>
        <aui:input name="name" />

        <aui:input name="price" />

        <aui:input name="description" />

        <liferay-ui:custom-attributes-available className="<%= Drink.class.getName() %>">
            <liferay-ui:custom-attribute-list
                    className="<%= Drink.class.getName() %>"
                    classPK="<%= (drink != null) ? drink.getDrinkId() : 0 %>"
                    editable="<%= true %>"
                    label="<%= true %>"
            />
        </liferay-ui:custom-attributes-available>

   <%--     <aui:input name="categories" type="assetCategories" />

        <aui:input name="tags" type="assetTags" />--%>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button href="<%= redirect %>" type="cancel" />
    </aui:button-row>
</aui:form>
