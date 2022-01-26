<%-- 
    Document   : Main_Menu
    Created on : 24/01/2022, 05:47:05 PM
    Author     : jodas

 <font color="black">
                     <a href="./insert_customer.jsp">Insertar cliente</a>
                    </font>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu principal</title>
    </head>
    <body>
    <center>
        <br><br>
        <b> <font face="Arial" size="20px" color="#000000">Menú Principal</font> </b>
        
        <br><br><br><br>
        <table border="5" cellpadding="20">
            <thead>
                <tr>
                    <th><font face="Arial" size="8px" color="#000000" >Cliente</font></th>
                    <th><font face="Arial" size="8px" color="#000000">Vehículo</font></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Create_Customer.jsp">Insertar Cliente</a>
                        </font></center></td>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Create_Vehicle.jsp">Insertar Vehículo</a>
                        </font></center></td>
                   
                </tr>
                <tr>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Update_Customer.jsp">Modificar Cliente</a>
                        </font></center></td>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Update_Vehicle.jsp">Modificar Vehículo</a>
                        </font></center></td>
                </tr>
                <tr>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Delete_Customer.jsp">Eliminar Cliente</a>
                        </font></center></td>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Delete_Vehicle.jsp">Eliminar Vehículo</a>
                        </font></center></td>
                </tr>
                <tr>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Read_Customer.jsp">Mostrar lista de Clientes</a>
                        </font></center></td>
                    <td><center><font face="Arial" size="6px" color="#000000">
                        <a href="./Read_Vehicle.jsp">Mostrar lista de Vehículos</a>
                        </font></center></td>
                </tr>
            </tbody>
        </table>




    </center>

</body>
</html>
