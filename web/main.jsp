<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Centro Convenciones Estacion Belgrano</title>
        <%@include file="WEB-INF/headMetaBS.jspf" %>

    </head>
    <body>
        <%@include file="WEB-INF/menu.jspf" %>
        <iframe name="myFrame" width="100%" height="200"> </iframe>
        <div class="row">
            <div class="col-12 col-md-6">
                <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100" src="images/Ciudad.jpg" alt="First slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Ciudad de Santa Fe</h5>
                                <p>Acceso este a la ciudad de santa fe</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="images/Estación-Belgrano.jpg" alt="Second slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Fachada</h5>
                                <p>fachada de la estacion belgrano de dia</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="images/la_estacion_de_noche_01.jpg" alt="Third slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Fachada</h5>
                                <p>fachada de la estacion belgrano</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>



            <div class="col-12 col-md-6">
              <iframe src="https://calendar.google.com/calendar/embed?height=300&amp;wkst=2&amp;bgcolor=%23ffffff&amp;ctz=America%2FArgentina%2FBuenos_Aires&amp;src=ZXN0ZWJhbm1jb3Jkb2JhQGdtYWlsLmNvbQ&amp;src=YWRkcmVzc2Jvb2sjY29udGFjdHNAZ3JvdXAudi5jYWxlbmRhci5nb29nbGUuY29t&amp;src=ZXN0YWNpb25iZWxncmFuby5ldmVudG9zQGdtYWlsLmNvbQ&amp;src=ZXMuYXIjaG9saWRheUBncm91cC52LmNhbGVuZGFyLmdvb2dsZS5jb20&amp;color=%237986CB&amp;color=%2333B679&amp;color=%23F6BF26&amp;color=%230B8043&amp;showTitle=0&amp;showNav=0&amp;showDate=1&amp;showPrint=0&amp;showTabs=1&amp;showCalendars=0&amp;showTz=0" style="border-width:0" width="400" height="300" frameborder="0" scrolling="no"></iframe>
            </div>















            <%@include file="WEB-INF/bodyBS.jspf" %>
</div>
    </body>
    <footer>

    </footer>
</html>
