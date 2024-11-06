import java.util.Scanner;

public class SistemaDescuentoVIP {

    public static void main(String[] args) {


        final var NO_PROUDCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);


        System.out.print("Productos: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Membresía (true/false)?: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NO_PROUDCTOS_DESCUENTO && tienesMembresia;

        System.out.println("tienes acceso al descuento VIP = " + esElegibleDescuento);


    }

}
