import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {

        //
        final var IMPORTE_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);

        System.out.print("Cuál fué el importe de tu compra? ");
        var importeCompra = Double.parseDouble(consola.nextLine());


        System.out.print("Eres miembro? (true/false) ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        //Calcular el descuento
        var descuento = 0.0;

        if(importeCompra >= IMPORTE_COMPRA_DESC && eresMiembro){
            descuento = 0.1; // 10%
        }
        else if(eresMiembro){
            descuento = 0.05;
        }
        else{
            descuento = 0;
        }


        if(descuento != 0){
            var importeDescuento = importeCompra * descuento;
            var importeFinal = importeCompra - importeDescuento;
            System.out.printf("""
                    %nFelicidades! has obtenido un descuento del %.0f%%
                    Importe de la compra: $%.2f
                    Importe del descuento: $%.2f
                    Importe Final con descuento: $%.2f
                    """, descuento * 100, importeCompra, importeDescuento, importeFinal);
        }else{
            System.out.printf("""
                    %nNo obtuviste ningún descuento.
                    Te invitamos hacerte miembro de la tienda!
                    Importe Final: $%.2f
                    """, importeCompra);
        }


    }
}
