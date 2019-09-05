package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO {
    Conexion cn = new Conexion(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

public void addEvento(Evento e){ 
        String sql="insert into eventos(nombre, fecha, espacio)values(?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setInt(2, e.getFecha());
            ps.setString(3, e.getEspacio());
            ps.executeUpdate();
        } catch (Exception ex) {
            
        }
       
        
    }

public List listarEventos(){
        String sql="select * from eventos";
        List<Evento>lista= new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Evento e= new Evento();
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

public Evento listarId(int id){
        Evento e = new Evento();
        String sql="select * from eventos where IdEvento="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                e.setNombre(rs.getString(1));
                e.setFecha(rs.getInt(2));
                e.setEspacio(rs.getString(3));
                }
        } catch (Exception ex) {
        }
        return e;
    }
    public void actualizar(Evento e){
        String sql="update eventos set nombre=?,fecha=?,espacio=? where IdEvento=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setInt(2, e.getFecha());
            ps.setString(3, e.getEspacio());
            ps.setInt(4, e.getId());
            ps.executeUpdate();
        } catch (Exception ex) {
        }

    }
    
    public void delete(int id){
        String sql="delete from eventos where IdEvento="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }



}
