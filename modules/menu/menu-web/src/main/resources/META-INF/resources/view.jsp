<%@ include file="init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>


<%
	List<String> testList = new ArrayList<String>();
	for(int i=0;i<=50;i++)
	{
		testList.add("String " + i);
	}
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/view.jsp");
	String drinkSearchContainerID = "drinkSearchContainerID";
	Integer drinkSearchContainerDelta = 5;
%>

<portlet:renderURL  var="addDrinkPageURL">
	<portlet:param name="mvcPath" value="/add_drink.jsp"/>
</portlet:renderURL>

<a href="<%=addDrinkPageURL.toString()%>">Add Drink</a><br>

<%--<%= testList.toString()%>--%>

<clay:management-toolbar
		searchContainerId="<%=drinkSearchContainerID%>"
		selectable="<%= false %>"
/>
<%--		displayContext="<%= DrinkManagementToolbarDisplayContext %>" totalItems="<%= drinkSearchContainerDelta %>"--%>

<liferay-ui:search-container delta="<%=drinkSearchContainerDelta%>"
							 deltaConfigurable="true"
							 id="<%=drinkSearchContainerID%>"
							 emptyResultsMessage="No Items were found!"
							 iteratorURL="<%=iteratorURL%>"
							 total="<%=testList.size()-1%>">
	<liferay-ui:search-container-results
			results="<%=testList.subList(searchContainer.getStart(), searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="String" modelVar="data">
		<liferay-ui:search-container-column-text name="name" value="<%=data %>" />
<%--		<liferay-ui:search-container-column-text name="functions" value="<%=data %>" align="right" href="javascript:submitForm();">--%>
<%--&lt;%&ndash;			Random thing like a link..&ndash;%&gt;--%>
<%--			<script type="text/javascript">--%>
<%--			function submitForm(){--%>
<%--			<%--%>
<%--				testList.set(3, "cica");--%>
<%--			%>--%>
<%--		</liferay-ui:search-container-column-text>--%>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>

