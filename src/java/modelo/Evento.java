
package modelo;

public class Evento {
    private String nombre;
    private int fecha;
    private String espacio;

    public Evento (String nombre, int fecha, String espacio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.espacio = espacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(int numero) {
        this.fecha = fecha;
    }
    public boolean equals (Evento c){ // lo necesito para facilitar los metodos que necesitan comparar si los nombres son iguales 
        if (this.nombre.equalsIgnoreCase(c.getNombre())) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() { //lo necesito para darle un mejor orden a los datos
        return "nombre=" + nombre + ", fecha=" + fecha;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
 
}


