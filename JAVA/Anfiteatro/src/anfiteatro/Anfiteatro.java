package anfiteatro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import anfiteatro.logica.ticket;

public class Anfiteatro {

    public static void main(String[] args) {

        //imagen 2 del ejercicio, POO

        List<ticket> listaTicket = new ArrayList<ticket>();
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        Scanner teclado4 = new Scanner(System.in);

        //parte personal, mi idea, no del ejercicio

        boolean bandera2 = false;        
        
        while (!bandera2) {
            int cont = 4;
            System.out.println("Por favor ingrese la fila: ");
            int fila = teclado2.nextInt();
            System.out.println("Por favor ingrese el asiento: ");
            int asiento = teclado2.nextInt();
            System.out.println("Por favor ingrese el precio: ");
            double precio = teclado3.nextDouble();
            
            
            ticket ticketFila = new ticket();
            ticketFila.setNumero(cont);
            ticketFila.setFila(fila);
            ticketFila.setAsiento(asiento);
            ticketFila.setPrecio(precio);
            ticketFila.setFechaCompra(new Date());
            ticketFila.setFechaValidez(new Date());

            listaTicket.add(ticketFila);
            
            System.out.println("Desea seguir ingresando tiquetes ? S/N");
            String salir = teclado.next();
            if (salir.equalsIgnoreCase("n")){
                bandera2 = true;
            }
            cont = cont ++;
        }

        //parte del ejercicio, donde se demuestra como se puede ingresar, tanto por datos como por objeto
        //insercion

        ticket ticket1 = new ticket(1, 1, 1, 1500, new Date(), new Date());
        ticket ticket2 = new ticket(2, 1, 2, 1500, new Date(), new Date());

        //encaptulamiento

        ticket ticket3 = new ticket();
        ticket3.setNumero(3);
        ticket3.setFila(2);
        ticket3.setAsiento(3);
        ticket3.setPrecio(1500);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());

        listaTicket.add(ticket1);
        listaTicket.add(ticket2);
        listaTicket.add(ticket3);

        double suma = 0;

        for (ticket ticket : listaTicket) {
            suma = suma + ticket.getPrecio();
        }

        System.out.println("La suma de los precios de los tickets es: " + suma);

        System.out.println("Ingrese la fila que desea ver: ");
        int fila2 = teclado2.nextInt();

        boolean bandera = false;

        for (ticket ticket : listaTicket) {
            if (ticket.getFila() == fila2) {
                System.out.println(ticket.toString());
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("No se encontraron tickets en la fila ingresada");
        }

    }

}
