<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>I18N Demo</title>
</head>
<body>
View website in:
<a href="?locale=en_US">English(US)</a>|
<a href="?locale=es_AR">Spanish</a>|
<a href="?locale=ru_RU">Russian</a>|
<a href="?locale=hi_IN">Hindi</a>
<br/>
<br/>
<hr/>
<fmt:setLocale value="${param.locale}"/>

<fmt:bundle basename="i18n/website">
<p><fmt:message key="label.hello"/> John, 
<p><fmt:message key="label.welcome"/>
<p><fmt:message key="label.message"/>
<p><fmt:message key="label.thanks"/>
</fmt:bundle>
<br/>
Locale: ${param.locale}

</body>
</html>









