<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in | Estacion Belgrano</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="login.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="icon" href="images/SFC_grid.png" type="image/png">
    </head>
    <body>
        <div class="login-form">
            <img src="images/SFC_grid.png" class="icon" alt=""/>
            <form   action="validacion" method="POST">
                <br>
                <br>
                <br>
                <center>
                    <h2>Iniciar Sesion</h2>
                </center>
                <br> 
                <div class="form-group">

                    <input type="txt" name="nombreUsuario" class="form-control" placeholder="Ingresar usuario">
                    <center>
                        <small class="form-text text-muted">*El usuario generalmente suele ser el mail institucional*</small>
                    </center>
                </div>

                <div class="form-group">

                    <input type="password" name="password" class="form-control" placeholder="Ingresar contraseña">
                </div>

                <center>
                    <button type="submit" name="accion" value="iniciarSesion" class="btn btn-success">Ingresar</button>
                </center>
            </form>
        </div>






        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>  
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
