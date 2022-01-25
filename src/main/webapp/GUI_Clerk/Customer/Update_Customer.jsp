<%-- 
    Document   : modify_Customer
    Created on : 24/01/2022, 07:21:39 PM
    Author     : jodas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Modificar Cliente </title>
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
                    <h2>  Formulario para editar información de los clientes </h2>

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

                            <input type="submit" value="Buscar cliente" />

                        </td>

                        <td>

                            <input type="reset" value="Cancelar" />

                        </td>

                    </tr>

                </table>
            </center>


        </form>

        <br>
        <br>
        
    <center>
        <table> 
            <tr>
            <h2>  Editar datos del cliente </h2>

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

                    <label> ¿Posee alguna discapacidad? </label>

                </td>

                <td>

                    <input type="checkbox" name="disabilityPresented">

                </td>

            </tr>


            <tr>

                <td>

                    <input type="submit" value="Guardar modificaciones" />

                </td>

                <td>

                    <input type="reset" value="Cancelar" />

                </td>

            </tr>

        </table>
    </center>

</body>
</html>
