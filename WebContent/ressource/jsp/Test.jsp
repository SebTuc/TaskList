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
	     <div>Ajout d'un Theme :</div>
			<input id="Theme" name="theme" />
			<button name="buttonAdd" value="${List.id_type}" type="submit">Add</button>
		 <br><br>
	     <c:forEach var="Theme" items="${List.themes}">
	     	${fn:escapeXml(Theme.nom)}
	     	<button name="deleteTheme" value="${Theme.id_theme}" type="submit">Delete</button>
	     	<button name="updateTheme" value="${Theme.id_theme}" type="submit">Update to => TEST!!</button>
	     	<br>
	     	<div>Ajout d'un message :</div>
				<input id="Liste" name="liste" />
				<button name="buttonAdd" value="${Theme.id_theme}" type="submit">Add</button>
			<br><br>
	     	<c:forEach var="test" items="${Theme.listes }">
	     		<span>- ${fn:escapeXml(test.message)}
	     		<button name="deleteList" value="${test.id_liste}" type="submit">Delete</button>
	     		</span>
	     		<br>
	     	</c:forEach>
	     	<br>
	     </c:forEach>
	</c:forEach>
	<br>
	<div>Ajout d'un types :</div>
	<input id="Types" name="type" />
	<button name="buttonAdd" value="add" type="submit">Add</button>
	<br>
</form> 
</body>
</html>