<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Lista de Personas</title>
</head>
<body>
<table>
    <thead>
        <th>ID</th><th>Nombre</th><th>Apellido</th><th>Fecha de Nacimiento</th><th>Lugar de Nacimiento</th>
    </thead>
    <tbody>
        <c:forEach var="persona" items="${PERSONAS}">
            <tr>
                <td>${persona.id}</td>
                <td>${persona.nombre}</td>
                <td>${persona.apellido}</td>
                <td><fmt:formatDate value="${persona.fechaNacimiento}" pattern="dd-MM-yyyy"></fmt:formatDate></td>
                <td>${persona.lugarNacimiento}</td>
            </tr>
        </c:forEach>
    </tbody>
    <form action="/hello-servlet" method="post">
        <input type="checkbox" id="filter" name="filter" value="true">
        <input type="submit" value="Filtrar">
    </form>
</table>
</body>
</html>