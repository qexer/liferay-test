<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="card.model.DrinkModel" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.service.ServiceContext" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Random" %>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<%@ page import="menucard.portlet.DrinkManagementToolbarDisplayContext" %>
<%@ page import="com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker" %>
<%@ include file="/init.jsp" %>

<%
    PortletURL portletURL = renderResponse.createRenderURL();
    String currentURL = portletURL.toString();

    PortletURL iteratorURL = renderResponse.createRenderURL();
    iteratorURL.setParameter("mvcPath", "/view.jsp");
    String drinkSearchContainerID = "drinkSearchContainerID";
    Integer drinkSearchContainerDelta = 5;
    String addElementLabel="Add new element";

 /*
    List<String> testList = new ArrayList<String>();
    for(int i=0;i<=50;i++)
    {
        testList.add("String " + i);
    }
    testList = drinkLocalService.getDrinks(0,drinkLocalService.getDrinksCount()).stream().map(DrinkModel::getName).collect(Collectors.toList());
*/
    List<Drink> drinkList = drinkLocalService.getDrinks(0,drinkLocalService.getDrinksCount());

    String loremSource = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ligula ex, volutpat in tincidunt in, convallis et eros. Sed ornare eros sit amet elementum porta. Nulla ultrices nulla sed ex bibendum vestibulum. Sed porta euismod elit, vel ultricies sapien imperdiet ac. Phasellus fermentum magna et lacus malesuada ornare. Nam pharetra lectus ac nisl sollicitudin venenatis vitae quis nulla. Nam interdum tincidunt enim maximus mollis. Mauris sit amet purus efficitur, fermentum lectus a, dapibus purus. Phasellus vel vehicula elit. Morbi ex ante, luctus id tincidunt vestibulum, convallis vitae neque. In nulla orci, accumsan placerat venenatis eu, aliquet nec eros. Duis et purus ac nulla maximus tincidunt. Nulla quis erat erat.";
    List<String> lorem = Arrays.stream(loremSource.split(" ")).collect(Collectors.toList());

    // Test list:
    if(drinkLocalService.getDrinksCount() <= 10){
        try {
            for(int i=0;i<=40;i+=2)
            {
                drinkLocalService.addDrink(lorem.get(i),new Random().ints(1,100,900).findFirst().getAsInt(),lorem.get(i+1));
            }
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }
%>
<%--Elemek: <%=testList.toString()%>
<br/><br/>--%>

<portlet:renderURL var="addDrinkURL">
    <portlet:param name="mvcPath" value="/add_drink.jsp" />
    <portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>
<clay:link href="<%=addDrinkURL%>" icon="plus" label="<%=addElementLabel%>" />

<%
    DrinkManagementToolbarDisplayContext drinkManagementToolbarDisplayContext = new DrinkManagementToolbarDisplayContext(request, liferayPortletResponse);
%>
<portlet:renderURL var="searchURL">
    <portlet:param name="mvcPath" value="/view.jsp" />
    <portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>
<clay:management-toolbar
        searchContainerId="<%=drinkSearchContainerID%>"
        selectable="<%= false %>"
        componentId="drinkManagementToolbarDisplayContext"
        itemsTotal="<%=drinkList.size()%>"
        searchActionURL="<%=searchURL%>"
        clearResultsURL="<%=searchURL%>"
        searchFormName="fm"
        searchInputName="<%= DisplayTerms.KEYWORDS %>"/>
<%--        searchValue="<%= ParamUtil.getString(request, searchInputName) %>"--%>
<%--namespace="<%= renderResponse.getNamespace() %>"--%>

<liferay-ui:search-container delta="<%=drinkSearchContainerDelta%>"
                             deltaConfigurable="true"
                             iteratorURL="<%=iteratorURL%>"
                             total="<%=drinkList.size()%>"
                             id="<%=drinkSearchContainerID%>"
                             emptyResultsMessage="No Items were found!">
<%--    rowChecker="<%= new EmptyOnClickRowChecker(renderResponse) %>"--%>
    <liferay-ui:search-container-results
            results="<%=drinkList.subList(searchContainer.getStart(), searchContainer.getEnd())%>" />
    <liferay-ui:search-container-row escapedModel="<%= true %>" keyProperty="drinkId" className="Drink" modelVar="drink" >
        <liferay-ui:search-container-column-text name="drinkId" property="drinkId" />
        <liferay-ui:search-container-column-text name="name" property="name" />
        <liferay-ui:search-container-column-text name="description" property="description" />
        <liferay-ui:search-container-column-text name="price" property="price" />
        <liferay-ui:search-container-column-text name="Actions">
            <portlet:renderURL var="editURL">
                <portlet:param name="mvcPath" value="/add_drink.jsp" />
                <portlet:param name="redirect" value="<%=currentURL%>" />
                <portlet:param name="drinkId" value="<%= String.valueOf(drink.getDrinkId()) %>" />
            </portlet:renderURL>
            <clay:link href="<%=editURL%>" icon="pencil"/>
            <%--<portlet:actionURL var="deleteURL">
                <portlet:param name="<%= Constants.CMD %>" value="<%=  Constants.DELETE %>" />
                <portlet:param name="redirect" value="<%=currentURL%>" />
                <portlet:param name="drinkId" value="<%= drink.getDrinkId() %>" />
            </portlet:actionURL>
            <clay:link href="<%=deleteURL%>" icon="trash"/>--%>
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>



<%--// TODO: ennek működnie kéne..--%>
<%--<liferay-ui:search-container delta="<%=drinkSearchContainerDelta%>"
                             deltaConfigurable="true"
                             id="<%=drinkSearchContainerID%>"
                             emptyResultsMessage="No Items were found!"
                             iteratorURL="<%=iteratorURL%>"
                             total="drinkLocalService.getDrinksCount()">
    <liferay-ui:search-container-results
            results="<%=drinkLocalService.getDrinks(searchContainer.getStart(), searchContainer.getEnd())%>" />
    <liferay-ui:search-container-row className="card.model.Drink" modelVar="drink">
        <liferay-ui:search-container-column-text name="name" property="name" />
        <liferay-ui:search-container-column-text name="price" property="price" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>--%>