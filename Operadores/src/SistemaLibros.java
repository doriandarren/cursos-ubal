import java.util.Scanner;

public class SistemaLibros {
    public static void main(String[] args) {

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Credencial estudiante? (true/false): ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("Cuantos KM vives? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;


        System.out.println("Te prestamos el libro? " + (esElegiblePrestamo ? "SI" : "NO"));



    }
}
