import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("estaDentroRango 1 y 10? " + estaDentroRango);


        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("estaFueraRango 1 y 10? " + estaFueraRango);
        

    }
}
