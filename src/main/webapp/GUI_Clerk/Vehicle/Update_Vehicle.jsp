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
        <title> Modificar Vehiculo </title>
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
                    <h2>  Formulario para editar información de los Vehículos </h2>

                    </tr>



                    <tr>

                        <td>

                            Placa:

                        </td>

                        <td>

                            <input type="text" name="plate">

                        </td>

                    </tr>


                    <tr>

                        <td>

                            <input type="submit" value="Buscar vehiculo" />

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
            <h2>  Editar datos del vehiculo </h2>

            </tr>

            <tr>

                <td>

                    Color

                </td>

                <td>

                    <input type="text" name="color">

                </td>

            </tr>

            <tr>

                <td>

                    <label> Marca del vehiculo: </label>

                </td>

                <td>

                    <input type="text" name="brand">

                </td>

            </tr>

            <tr>

                <td>

                    Modelo del vehiculo: 

                </td>

                <td>

                    <input type="text" name="model">

                </td>

            </tr>

            <tr>

                <td>

                    Dueño del vehiculo: 

                </td>

                <td>

                    <select name="owner">
                        <option value="owner1">Prueba</option>
                        <option value="owner2">Prueba</option>
                        <option value="owner3">Prueba</option>
                        <option value="owner4">Prueba</option>
                    </select>

                </td>

            </tr>

            <tr>

                <td>

                    Tipo de vehiculo: 

                </td>

                <td>

                    <select name="vehicleType">
                        <option value="type1">Motocicleta</option>
                        <option value="type2">Liviano</option>
                        <option value="type3">Pesado</option>
                        <option value="type4">Bicicleta</option>
                        <option value="type5">Otro</option>
                    </select>

                </td>

            </tr>

        </table>
    </center>

</body>
</html>
