<%-- 
    Document   : show_info_customer
    Created on : 19/01/2022, 02:34:12 PM
    Author     : jodas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente insertado</title>
        <%
String name = request.getParameter("name"); String email = request.getParameter("email"); String phone = request.getParameter("phone"); String address = request.getParameter("address");
String username = request.getParameter("username"); String password = request.getParameter("password");
        %>
    </head>
    <body>
        Datos del cliente insertado:
        Nombre: <%=name%> 
        Correo: <%=email%> 
        Teléfono: <%=phone%> 
        Dirección: <%=address%> 
        Usuario: <%=username%> 
        Password: <%=password%>
    </body>
</html>