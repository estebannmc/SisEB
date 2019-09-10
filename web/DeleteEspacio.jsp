<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Espacio</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

    </head>
    <body>
        <%@include file="WEB-INF/menu.jspf" %>
        <form style="width: 340px; margin: 50px auto;">
            <div class="form-group">
                <label for="exampleFormControlInput1">Ingrese el ID del espacio</label>
                <input type="txt" class="form-control" placeholder="Ejemplo: 101">
                <button type="submit"  class="btn btn-success">Eliminar</button>
            </div>
        </form>


        <%@include file="WEB-INF/bodyBS.jspf" %>
    </body>
</html>
