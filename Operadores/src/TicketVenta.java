import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {


        var consola = new Scanner(System.in);

        System.out.print("Prcio lecha: ");
        var precioLEche = Double.parseDouble(consola.nextLine());

        System.out.print("Prcio Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());


        System.out.print("Prcio Lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Prcio Platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());


        System.out.print("Aplicar descuentos (%)?");
        var descuentoProcentaje = Integer.parseInt(consola.nextLine());


        // Calculos sin impuesto
        var subtotal = precioLEche + precioPan + precioLechuga + precioPlatanos;

        var descuento = subtotal * (descuentoProcentaje / 100.0);

        //Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // calculos con impuesto
        var impuesto = subtotalConDescuento * 0.16;


        var costoTotalCompra = subtotalConDescuento + impuesto;

        //Imrimir

        System.out.printf("""
                %nTicket de Venta
                -----------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Toptal: $%.2f
                """, subtotal, descuento, descuentoProcentaje, impuesto, costoTotalCompra);

    }
}
