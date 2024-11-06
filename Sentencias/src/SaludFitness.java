import java.util.Scanner;

public class SaludFitness {

    public static void main(String[] args) {

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);

        System.out.print("Usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Pasos del día: ");
        var pasos_diarios = Integer.parseInt(consola.nextLine());


        var calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;
        System.out.println("calorias_quemadas = " + calorias_quemadas);

        var metaAlcanzada = (pasos_diarios >= META_PASOS_DIARIO) ? "Si :)" : "No :(";

        System.out.println("metaAlcanzada = " + metaAlcanzada);

        System.out.printf("""
                %nUsuario: %s
                Pasos dado hoy: %d
                Calorías: %.2f kcal
                Meta alcanzada: %s
                --------------------
                La meta de pasos: %d pasos
                """, usuario, pasos_diarios, calorias_quemadas, metaAlcanzada, META_PASOS_DIARIO);



    }

}
