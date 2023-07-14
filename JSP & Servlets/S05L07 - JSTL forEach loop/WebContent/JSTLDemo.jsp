<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<%
		String[] names = new String[3];
		names[0] = "Chaand";
		names[1] = "John";
		names[2] = "Nikita";
	%>

	<c:forEach items="<%=names%>" var="name">

		${name}
		<br />

	</c:forEach>

</body>
</html>








