<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Espacios</title>
        <link href="estilosEspacios.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/headMetaBS.jspf" %>
    </head>
    <body>
        <header class="header">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="main.jsp">Centro de Convenciones Estacion Belgrano</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav m-auto">

                        <li class="nav-item dropdown active">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Espacios
                            </a>
                            
                                
                                <a class="dropdown-item" href="#" target="myFrame">Agregar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Editar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Eliminar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Listar espacios</a>
                            
                        </li>
                        <li class="nav-item dropdown active">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Eventos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                
                                <a class="dropdown-item" href="#">Agregar evento</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Editar evento</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Eliminar evento</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Listar eventos</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="https://www.santafeciudad.gov.ar/" target="_blank">SF Ciudad</a>
                        </li>
                    </ul>

                </div>
            </nav>
        </header>
         <iframe name="myFrame" width="100%" height="900px;"/>

        <%@include file="WEB-INF/bodyBS.jspf" %>
    </body>
</html>
