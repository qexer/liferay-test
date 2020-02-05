<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@taglib uri="http://liferay.com/tld/journal" prefix="liferay-journal" %>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page pageEncoding="UTF-8"%>
<%@page contentType="text/html; charset=UTF-8"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>

<%@page import="com.liferay.portal.kernel.servlet.BrowserSnifferUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />