package modelo;

public class Espacio {
    int id;
    String nombre;
    int capacidad;
    String lugar;

    public Espacio() {
    }

    public Espacio(String nombre, int capacidad, String lugar) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.lugar = lugar;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
