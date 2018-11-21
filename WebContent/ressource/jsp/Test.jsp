<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Hibernate</title>
</head>
<body>
<div>Test hibernate :</div>
<br>
<c:forEach var="List" items="${ allTypes }"> 
     ${fn:escapeXml(List.nom)}
</c:forEach>
</body>
</html>