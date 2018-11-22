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
<form method="post">
	<c:forEach var="List" items="${allTypes}"> 
		<br>
	     ${fn:escapeXml(List.nom)} :
	     <br>
	     <c:forEach var="Theme" items="${List.themes}">
	     	${fn:escapeXml(Theme.nom)}
	     	<button name="deleteTheme" value="${Theme.id_theme}" type="submit">Delete</button>
	     	<br>
	     	<c:forEach var="test" items="${Theme.listes }">
	     		<span>- ${fn:escapeXml(test.message)}
	     		<button name="deleteList" value="${test.id_liste}" type="submit">Delete</button>
	     		</span>
	     		<br>
	     	</c:forEach>
	     	<br>
	     </c:forEach>
	</c:forEach>
</form> 
</body>
</html>