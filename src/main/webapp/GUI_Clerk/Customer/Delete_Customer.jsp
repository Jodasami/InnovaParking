<%-- 
    Document   : delete_Customer
    Created on : 24/01/2022, 07:22:41 PM
    Author     : jodas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Cliente</title>
    </head>
    <body>
        <form action="CustomerInfoServlet" method="get">
            <br>
            <br>
            <br>
            <br>
            <center>
                <table> 
                    <tr>
                    <h2>  Formulario para eliminar de clientes </h2>

                    </tr>



                    <tr>

                        <td>

                            Cédula

                        </td>

                        <td>

                            <input type="text" name="id">

                        </td>

                    </tr>


                    <tr>

                        <td>

                            <input type="submit" value="Eliminar cliente" />

                        </td>

                        <td>

                            <input type="reset" value="Cancelar" />

                        </td>

                    </tr>

                </table>
            </center>


        </form>
    </body>
</html>
