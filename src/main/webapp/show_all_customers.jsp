<%-- 
    Document   : show_all_customers
    Created on : 19/01/2022, 02:33:47 PM
    Author     : jodas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de clientes</title>
    </head>
    <body>
        <table border="2">
            <td>Nombre</td>
            <td>Correo</td>
            <td>Teléfono</td>
            <td>Dirección</td>
            <td>Usuario</td>
            <c:forEach items="${customers}" var="currentCustomer">
                <tr>
                    <td><c:out value="${currentCustomer.name}"/> </td>
                    <td><c:out value="${currentCustomer.email}"/></td>
                    <td><c:out value="${currentCustomer.phone}"/></td>
                    <td><c:out value="${currentCustomer.address}"/></td>
                    <td><c:out value="${currentCustomer.username}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>