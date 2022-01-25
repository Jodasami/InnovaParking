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
            <br>
            <br>
            <br>
            <br>
            <center>
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

                            Cédula

                        </td>

                        <td>

                            <input type="text" name="id">

                        </td>

                    </tr>

                    <tr>

                        <td>

                            <label> ¿Posee alguna discapacidad? </label>

                        </td>

                        <td>

                            <input type="checkbox" name="disabilityPresented">

                        </td>

                    </tr>
                  

                    <tr>

                        <td>

                            <input type="submit" value="Guardar cliente" />

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
