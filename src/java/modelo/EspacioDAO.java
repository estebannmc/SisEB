package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EspacioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listarEspacio() {
        String sql = "select * from eventos";
        List<Evento> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Evento e = new Evento();
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setFecha(rs.getInt(3));
                e.setEspacio(rs.getString(4));
                lista.add(e);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public void actualizarEspacio(Espacio e) {
        String sql = "update eventos set nombre=?,capacidad=?,lugar=? where IdLugar=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setInt(2, e.getCapacidad());
            ps.setString(3, e.getLugar());
            ps.setInt(4, e.getId());
            ps.executeUpdate();
        } catch (Exception ex) {
        }

    }

    public void deleteEspacio(int id) {
        String sql = "delete from espacios where IdEspacio=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public void addEspacio(Espacio e) {
        String sql = "insert into espacios(nombre, capacidad, lugar)values(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setInt(2, e.getCapacidad());
            ps.setString(3, e.getLugar());
            ps.executeUpdate();
        } catch (Exception ex) {

        }

    }

}
