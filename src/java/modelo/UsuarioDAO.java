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
        String sql = "select * from usuarios where mail='"+user+"' and password='"+pass+"'";
        try {
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setUsuario(rs.getString(1));
            u.setPassword(rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
       }
    }
