package anfiteatro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import anfiteatro.logica.ticket;

public class Anfiteatro {

    public static void main(String[] args) {

        List<ticket> listaTicket = new ArrayList<ticket>();

        ticket ticket1 = new ticket(1, 1, 1, 1500, new Date(), new Date());
        ticket ticket2 = new ticket(2, 1, 2, 1500, new Date(), new Date());

        ticket ticket3 = new ticket();
        ticket3.setNumero(20);
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

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la fila que desea ver: ");
        int fila = teclado.nextInt();

        boolean bandera = false;

        for (ticket ticket : listaTicket) {
            if (ticket.getFila() == fila) {
                System.out.println(ticket.toString());
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("No se encontraron tickets en la fila ingresada");
        }

    }

}
