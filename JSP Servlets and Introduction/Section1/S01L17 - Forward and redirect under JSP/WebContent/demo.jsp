<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo</title>
</head>
<body>
It's from the original page
<%
   //request.getRequestDispatcher("forward.jsp").forward(request, response);
   response.sendRedirect("redirect.jsp");
%>
</body>
</html>