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
        <title>Listado de Clientes</title>
    </head>
    <body>
         <br>
            <br>
            <br>
            <br>
            <center>
        <table border="2">
            <td>Nombre</td>
            <td>Cédula</td>
            <td>¿Presenta alguna discapacidad?</td>
           
            <c:forEach items="${customers}" var="currentCustomer">
                <tr>
                    <td><c:out value="${currentCustomer.name}"/> </td>
                    <td><c:out value="${currentCustomer.id}"/></td>
                    <td><c:out value="${currentCustomer.disabilityPresented}"/></td>
                </tr>
            </c:forEach>
        </table>
                </center>
    </body>
</html>