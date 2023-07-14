<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<c:import url="/Users.xml" var="XMLFile" />
	<x:parse xml="${XMLFile}" var="XMLdoc" />
	Name:	<x:out select="$XMLdoc/users/user[2]/name" />
	<br />Gender:	<x:out select="$XMLdoc/users/user[2]/gender" />
	<br /> Age:	<x:out select="$XMLdoc/users/user[2]/age" />
	
</body>
</html>









