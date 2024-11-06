import java.util.Scanner;

public class ReservaHotel {

    public static void main(String[] args) {

        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        var consola = new Scanner(System.in);

        System.out.print("Nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadías: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false)?: ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = 0.0;
        if(conVistaAlMar){
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR;
        }else{
            costoTotal = diasEstadia * TARIFA_DIARIA_SIN_VISTA_MAR;
        }

        System.out.printf("""
                %n------------ Detalles de la Reservación ----------------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, conVistaAlMar ? "Si :)" : "No :(");

    }

}
