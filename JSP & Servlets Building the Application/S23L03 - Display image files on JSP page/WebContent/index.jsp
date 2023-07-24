<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Image upload form</title>
</head>
<body>
<form action="ImageUpload?action=filesUpload" method="post" enctype="multipart/form-data">
Select images <input type="file" name="files" multiple/>
<input type="submit" value="upload"/>
<br/>
<a href="${pageContext.request.contextPath}/ImageUpload?action=listingImages">View available images</a>


</form>
</body>
</html>