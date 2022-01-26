<%-- 
    Document   : login
    Created on : Jan 24, 2022, 1:48:36 PM
    Author     : Fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso al Sistema</title>
    </head>
    <body background="Images/bG.png">
    <br><br><br> 
    <center>
        <form  name="loginForm" action="CustomerInfoServlet" method="post">
            <i>
                <marquee><b><font color="white" size="8">Bienvenid@ a InnovaParking</font></b>
                </marquee>
            </i>
            
            <br><br>
            
            <font size="5" color="white">
                Digite su Usuario y Contraseña para continuar
            </font>
            
            <br>

            <font  color="white"  ><h1 align="center"><label>Usuario:</label></h1>
            </font>
            <br>

            <input type="text"  name="username" value="" size="30" />

            <br>
            <br>
            <font  color="white"  ><h1 align="center"><label>Contraseña:</label></h1>
            </font>
            <br>

            <input type="password" name="password" value="" size="30"/>

            <br>
            <br>

            <input type="submit" value="Ingresar" name="login" />

            <input type="reset" value="Cancelar" name="cancel" />

        </form> 
    </body>
    </center>
</body>
</html>
