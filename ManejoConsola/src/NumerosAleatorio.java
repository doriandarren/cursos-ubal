import java.util.Random;

public class NumerosAleatorio {

    public static void main(String[] args) {
        System.out.println("*** Números aleatorios ***");

        var random = new Random();

        // 0 - 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio 0 y 9= " + numeroAleatorio);


        // 1 - 10

        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio 1 y 10= " + numeroAleatorio);


        // 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);


        // Lanzamiento de un dado
        var dado = random.nextInt(6) + 1; // se le suma para incluir el numero 6
        System.out.println("Lanzar el dado = " + dado);



    }
}
