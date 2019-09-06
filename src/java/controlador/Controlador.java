package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.UsuarioDAO;

public class Controlador extends HttpServlet {
    UsuarioDAO uDAO= new UsuarioDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //String nombreDefecto = "esteban";
        //String passDefecto = "esteban1";
        //Agenda agenda1 = new Agenda();

        String accion = request.getParameter("accion");

        switch (accion) {
            case "iniciarSesion": {
                String nombre = request.getParameter("nombreUsuario");
                String pass = request.getParameter("password");
                Usuario user= uDAO.validar(nombre, pass);
                if (user!=null) {
                    response.sendRedirect("main.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            }
            break;
     
            case "AgregarEspacio": {
                request.getRequestDispatcher("AddEspacio.jsp").forward(request, response);
            }
                break;
            case "DeleteEspacio":
                request.getRequestDispatcher("DeleteEspacio.jsp").forward(request, response);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
