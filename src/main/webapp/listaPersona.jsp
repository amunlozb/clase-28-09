<%--
  Created by IntelliJ IDEA.
  User: usuario_mañana
  Date: 28/09/2023
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="https://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="https://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        <c.forEach var="persona" items="·{PERSONAS}">
            <tr>
                <td>${persona.id}</td>
                <td>${persona.nombre}</td>
                <td>${persona.apellido}</td>
                <td><fmt:formatDate value="${persona.fechaNacimiento}" pattern="dd-MM-yyyy"></td>
                <td>${persona.lugarNacimiento}</td>
            </tr>
        </c.forEach>
    </tbody>
</table>
</body>
</html>
