<%-- 
    Document   : insert_Customer
    Created on : 18/01/2022, 10:15:10 AM
    Author     : jodas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar cliente</title>
    </head>
    <body>
        <i>
            <font size=6 COLOR=009900>
            <marquee>
                SISTEMA DE INGRESO DE CLIENTES
            </marquee>
            </font>
        </i>

        <form action="CustomerInfoServlet" method="get">

            <table>
                <tr>
                <h2>  Formulario de ingreso de clientes </h2>

                </tr>

                <tr>

                    <td>

                        Nombre: 

                    </td>

                    <td>

                        <input type="text" name="name">

                    </td>

                </tr>

                <tr>

                    <td>

                        Correo: 

                    </td>

                    <td>

                        <input type="text" name="email">

                    </td>

                </tr>

                <tr>

                    <td>

                        <label> Teléfono:</label>

                    </td>

                    <td>

                        <input type="text" name="phone">

                    </td>

                </tr>
                <tr>

                    <td>

                        Dirección:

                    </td>

                    <td>

                        <input type="text" name="address">

                    </td>

                </tr>
                <tr>

                    <td>

                        Username:

                    </td>

                    <td>

                        <input type="text" name="username">

                    </td>

                </tr>

                <tr>

                    <td>

                        Password:

                    </td>

                    <td>

                        <input type="text" name="password">

                    </td>

                </tr>

                <tr>

                    <td>

                        <input type="submit" value="Guardar cliente" />

                    </td>

                    <td>

                        <input type="submit" value="Cancelar" />

                    </td>

                </tr>

            </table>



        </form>


    </body>
</html>
