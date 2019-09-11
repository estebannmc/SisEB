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
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" >
                                Espacios
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#" >Agregar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Editar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Eliminar espacio</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Listar espacios</a>

                        </li>
                        <li class="nav-item dropdown active">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" >
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
    <center><h1>Centro de Convenciones Estacion Belgrano</h1></center>
    <br>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-md-8">

                <div class="row">
                    <div class="col-md-6"><p>La Estación Belgrano es uno de los edificios más emblemáticos de la ciudad. El estilo arquitectónico de este Centro de Convenciones ofrece espacios amplios y cómodos para la realización de cualquier tipo de evento. El edificio fue inaugurado en 1912 como estación ferroviaria para el centro norte del país y guarda en su memoria gran parte de la historia de la ciudad. Luego de años de abandono fue recuperada en 2009 por el Gobierno de la Ciudad poniendo en valor un edificio nodal del patrimonio </p></div>
                    <div class="col-md-6"><p>arquitectónico y urbanístico de Santa Fe. Desde 2011, la Estación Belgrano ha sido sede de eventos de gran magnitud: ferias, exposiciones, charlas, seminarios, entre otros. Entre los más destacables se encuentran Expocon, Fiesta de las Colectividades, Casafé, Feria del Libro, Diseña Santa Fe y ExpoCarreras. El Centro de Convenciones cuenta con 13 espacios cubiertos y 3 al aire libre, de diferentes características y capacidades, adaptables cada uno a diversas tipologías de eventos y a sus diferentes necesidades. </p></div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card" style="max-width: 302px;">

                    <!-- Image -->
                    <img class="card-img-top" src="images/Estación-Belgrano.jpg" alt="">

                    <!-- Text Content -->
                    <div class="card-body">
                        <p class="card-text">Superficie cubierta: 8.400 m2 | Superficie al aire libre: 10.300 m2 | 200 plazas de estacionamiento</p>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <align <h2>Planta baja</h2>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="card" style="max-width: 302px;">
                    <!-- Image -->
                    <img class="card-img-top" src="images/IMG_5394.jpeg" alt="">
                    <!-- Text Content -->
                    <div class="card-body">
                        <p class="card-text">Superficie total: 65 X 10 m | 900 personas | Área: 650 m2</p>
                    </div>
                </div>
            </div>
            <div class="col-md-8">
                <h3>Explanada</h3>
                    <div class="row">
                        <div class="col-md-6"><p>La explanada es un espacio capaz de jerarquizar cualquier tipo de evento, por sus amplias dimensiones, la imponente altura de sufachada y una ubicación estratégica en una de las principales avenidas de la ciudad.</p></div>
                        <div class="col-md-6"></div>
                    </div>
            </div>

        </div>
    </div>
   <div class="container">
        <div class="row">
            <div class="col-md-8">
                <center><h3>Hall</h3></center>
                <div class="row">
                    <div class="col-md-6"><p>El hall principal, de alto valor patrimonial, cuenta con pisos de granito, molduras ornamentales y aberturas recuperadas de las originales que traen al presente la belleza de la antigua Estación.</p></div>
                    <div class="col-md-6"></div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card" style="max-width: 302px;">

                    <!-- Image -->
                    <img class="card-img-top" src="images/IMG_20190715_184530952.jpg" alt="">

                    <!-- Text Content -->
                    <div class="card-body">
                        <p class="card-text">Superficie total: 40 x 12.60 m | Área: 459 m2 | 650 personas</p>
                    </div>

                </div>
            </div>
        </div>
    </div>



    <%@include file="WEB-INF/bodyBS.jspf" %>
</body>
</html>