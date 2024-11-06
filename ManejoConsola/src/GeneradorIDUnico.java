import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema Genrador Unico ID ***");

        System.out.print("Nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Apellido: ");
        var apellido = consola.nextLine();

        System.out.print("Año: ");
        var anio = consola.nextLine();



        // JUPE955232

        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;

        var id = nombre.trim().substring(0, 2).toUpperCase() +
                        apellido.trim().substring(0, 2).toUpperCase() +
                        anio.substring(2) +
                        "%04d".formatted(numeroAleatorio);


        System.out.printf("""
                Hola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \tFelidades!
                """, nombre, id);


    }
}
