<%@ include file="init.jsp" %>

<portlet:renderURL windowState="normal" var="backURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<liferay-ui:header
        backURL="<%= backURL %>"
        title="Back"
/>

<portlet:actionURL name="addDrink" var="addDrinkURL" />

<%--    TODO: label-t szerkeszthetővé tenni admin oldalról--%>
<aui:form name="fm" action="<%=addDrinkURL.toString()%>" method="post">
    <aui:input name="drinkName" label="Drink name"/>
    <aui:button-row>
        <aui:button name="addDrink" type="submit" value="Add Drink"  />
    </aui:button-row>
</aui:form>