package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Espacio;
import modelo.EspacioDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;

public class Controlador extends HttpServlet {

    UsuarioDAO uDAO = new UsuarioDAO();

    Espacio esp = new Espacio();
    EspacioDAO espDAO = new EspacioDAO();

    int idx;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
        String menu = request.getParameter("menu");
        if (menu.equals("main")) {
            request.getRequestDispatcher("main.jsp").forward(request, response);
        }
        
        
        switch (accion) {
            case "iniciarSesion": {
                String nombre = request.getParameter("nombreUsuario");
                String pass = request.getParameter("password");
                Usuario nombre1 = uDAO.validar(nombre, pass);
                if (nombre1 != null) {
                    request.getRequestDispatcher("main.jsp").forward(request, response);
                } else {
                    response.sendRedirect("index.jsp");
                }
            }
            break;

            case "agregarEspacio": {
                request.getRequestDispatcher("index.jsp").forward(request, response);

                String nombre = request.getParameter("txtName");
                int capacidad = Integer.parseInt(request.getParameter("txtCapacidad"));
                String lugar = request.getParameter("selecLugar");

                esp.setNombre(nombre);
                esp.setCapacidad(capacidad);
                esp.setLugar(lugar);

                espDAO.addEspacio(esp);
                request.getRequestDispatcher("Controlador?ListarEspacio=Listar").forward(request, response);
                
            }
            break;

            case "deleteEspacio": //EliminarEspacio
                idx = Integer.parseInt(request.getParameter("id"));
                espDAO.deleteEspacio(idx);
                request.getRequestDispatcher("Controlador?accion=listarEspacio").forward(request, response);
               // request.getRequestDispatcher("main.jsp").forward(request, response);
                
                break;

            case "actualizarEspacio": { //modificarEspacio
                idx = Integer.parseInt(request.getParameter("id"));
                Espacio e = espDAO.listarId(idx);
                request.setAttribute("e", e);
                request.getRequestDispatcher("Controller?ListarEspacio=Listar").forward(request, response);
                request.getRequestDispatcher("main.jsp").forward(request, response);
            }
            break;
            case "listarEspacio":
                List<Espacio> lista = new ArrayList<>();
                    lista = espDAO.listarEspacio();
                    request.setAttribute("lugares", lista);
                   
                    break;
        
        }
        }
    

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
