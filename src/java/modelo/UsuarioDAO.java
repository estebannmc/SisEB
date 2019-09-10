package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    Conexion cn = new Conexion(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario validar(String user, String pass) {
        String sql="select * from usuarios where mail='"+user+"' and password='"+pass+"'";
        Usuario usuario;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
       
            while (rs.next()) {
            usuario= new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setUsuario(rs.getString(2));
            usuario.setPassword(rs.getString(3));
            return usuario;
        }
        } catch (Exception e) {
        }
        return null;
       }
    }