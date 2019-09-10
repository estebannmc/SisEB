<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Espacio</title>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

    </head>
    <body>
        <%@include file="WEB-INF/menu.jspf" %>
        <form style="width: 340px; margin: 50px auto;">
            <div class="form-group">
                <label for="exampleFormControlInput1">Nombre del espacio</label>
                <input type="txtName" class="form-control" placeholder="Ejemplo: Sala Manuel Belgrano">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput2">Capacidad del espacio</label>
                <input type="txtCapacidad" class="form-control" placeholder="Ejemplo: 20 personas">
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Ubicacion fisica</label>
                <select type="selecLugar" class="form-control" id="exampleFormControlSelect1">
                    <option>Planta Alta</option>
                    <option>Planta Baja</option>
                </select>
            </div>
            
        </form>
        
        
        
        
         <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>  
           <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
