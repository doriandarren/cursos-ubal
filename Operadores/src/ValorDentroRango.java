import java.util.Scanner;

public class ValorDentroRango {

    public static void main(String[] args) {

        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.print("Proporciona dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());


        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;

        System.out.println("estaDentroRango = " + estaDentroRango);
        

    }

}
