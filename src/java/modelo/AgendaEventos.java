package modelo;
import java.util.Scanner;
import java.util.InputMismatchException;//no tengo idea que es pero lo necesito para el catch

public class AgendaEventos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n"); //cada vez que utilizo el scanner lo limpia con un salto de linea.
        boolean salir = false;
        int opcion;
        int cantidad2;
        Agenda nuevaAgenda = new Agenda();//agenda x defecto, por lo tanto tiene 10 contactos
        String nombre;
        int numero;
        Evento e;//variable auxiliar para que vaya almacenando los datos de los contactos en c
        int cantidad;
        System.out.println("                               Mi agenda");
        System.out.println("Â¿Cuantos contactos desea contener? (1 = 10 contactos) (2 = contactos que desee)");
        cantidad = teclado.nextInt();
        if (cantidad == 1) {
            System.out.println("*************************");
            System.out.println("1. AÃ±adir evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Buscar eventos");
            System.out.println("4. Existe eventos");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            while (!salir) {

                try { //se utiliza para preveer excepciones en el transcurso del programa
                    System.out.println("***************************");
                    System.out.println("Escribe una de las opciones");
                    opcion = teclado.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println("Escribe un nombre");
                            nombre = teclado.next();
                            System.out.println("Ingrese su numero de telefono");
                            numero = teclado.nextInt();
                            c = new Contacto(nombre, numero);
                            nuevaAgenda.aniadirContacto(c);
                        
                            break;

                        case 2:
                            nuevaAgenda.listarContactos();
                        
                            break;

                        case 3:
                            System.out.println("Escribe un nombre");
                            nombre = teclado.next();
                            nuevaAgenda.buscarContacto(nombre);
                            break;
                        case 4:
                            System.out.println("Escribe un contacto");
                            nombre = teclado.next();
                            c = new Contacto(nombre, 0);
                            if (nuevaAgenda.existeContacto(c)) {
                                System.out.println("Existe contacto");
                            } else {
                                System.out.println("No existe contacto");
                            }
                            break;

                        case 5:
                            System.out.println("Escribe el nombre del contacto");
                            nombre = teclado.next();
                            c = new Contacto(nombre, 0);
                            nuevaAgenda.eliminarContacto(c);
                            break;

                        case 6:
                            System.out.println("Hay " + nuevaAgenda.huecosLibre() + " contactos libre");
                            break;

                        case 7:
                            if (nuevaAgenda.agendaLlena()) {
                                System.out.println("la agenda esta llena");

                            } else {
                                System.out.println("aun quedan contactos para agregar");
                            }
                            break;

                        case 8:
                            salir = true;
                            break;

                        default: // cuando no se seleciona una de las opciones pasa lo que este dentro de default
                            System.out.println("Solo numeros del 1 al 8");
                    }

                } catch (InputMismatchException e) { // es la continuacion del try, siendo lo que se produce cuando aplicamos una excepcion
                    System.out.println("Debe insertar un numero");
                    teclado.next();
                }
            }

        } else {
            System.out.println("Ingrese la cantidad de contactos que desee: ");
            cantidad2 = teclado.nextInt();
            Agenda nueva = new Agenda(cantidad2);// cree otra agenda para cuando el usuario quiera la cantidada de contactos
            System.out.println("*************************");
            System.out.println("1. AÃ±adir contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            while (!salir) {
                try {
                    System.out.println("*************************");
                    System.out.println("Escribe una de las opciones");
                    opcion = teclado.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println("Escribe un nombre");
                            nombre = teclado.next();
                            System.out.println("Ingrese su numero de telefono");
                            numero = teclado.nextInt();
                            c = new Contacto(nombre, numero);
                            nueva.aniadirContacto(c);
                       
                            break;

                        case 2:
                            nueva.listarContactos();
                       
                            break;

                        case 3:
                            System.out.println("Escribe un nombre");
                            nombre = teclado.next();
                            nueva.buscarContacto(nombre);
                        
                            break;
                        case 4:
                            System.out.println("Escribe un contacto");
                            nombre = teclado.next();
                            c = new Contacto(nombre, 0);
                            if (nueva.existeContacto(c)) {
                                System.out.println("Existe contacto");
                            } else {
                                System.out.println("No existe contacto");
                            }
                        
                            break;

                        case 5:
                            System.out.println("Escribe el nombre del contacto");
                            nombre = teclado.next();
                            c = new Contacto(nombre, 0);
                            nueva.eliminarContacto(c);
                       
                            break;

                        case 6:
                            System.out.println("Hay " + nueva.huecosLibre() + " contactos libre");
                     
                            break;

                        case 7:
                            if (nueva.agendaLlena()) {
                                System.out.println("la agenda esta llena");

                            } else {
                                System.out.println("aun quedan contactos para agregar");
                            }
                  
                            break;

                        case 8:
                            salir = true;
                   
                            break;

                        default:
                            System.out.println("Solo numeros del 1 al 8");
                  
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Debe insertar un numero");
                    teclado.next();
                }
            }

        }
    }
}

}
