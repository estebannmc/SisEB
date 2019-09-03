
package modelo;

public class Agenda {
 
    private Evento[] eventos;

    public Agenda() {
        this.eventos = new Evento[10];
    }

    public Agenda(int tamanio) {
        this.eventos = new Evento[tamanio];
    }

    public void addEvent(Evento e) {
        if (this.existEvent(e)) {
            System.out.println("El evento con ese nombre ya existe");
        } else if (agendaLlena()){
            System.out.println("La agenda esta llena, no se pueden ingresar más eventos");
        }else{

            boolean encontrado = false;
            for (int i = 0; i < eventos.length && !encontrado; i++) {
                if (eventos[i] == null) {
                    eventos[i] = e;
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Se ha agregado el evento");
            } else {
                System.out.println("No se ha agregado el evento");
            }

        }

    }

    public boolean existEvent(Evento e) {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && e.equals(eventos[i])) {
                return true;
            }
        }
        return false;
    }

    public void listarEventos() {
        if (huecosLibre ()== eventos.length) {
            System.out.println("No hay eventos en la agenda.");
            
        }else{
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null) {
                System.out.println(eventos[i]);
              }
             }
            
            }
    }
    

    public void SearchEvent(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El evento es: " + eventos[i].getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el evento");

        }
    }

    public boolean agendaLlena() {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void eliminarEvento(Evento e) {
        boolean encontrado = false;
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].equals(e)) {
                eventos[i] = null;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha eliminado el evento");
        } else {
            System.out.println("Se ha eliminado el evento");
        }

    }

    public int huecosLibre() {
        int contador = 0;
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] == null) {
                contador++;
            }
        }
        return contador;
    }

}