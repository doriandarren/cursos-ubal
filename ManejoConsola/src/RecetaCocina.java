import java.util.Scanner;

public class RecetaCocina {

    public static void main(String[] args) {

        System.out.println("*** Cooking ***");


        var consola = new Scanner(System.in);

        System.out.print("Nombre: ");
        var nombreReceta = consola.nextLine();


        System.out.print("Ingredientes: ");
        var ingredientes = consola.nextLine();


        System.out.print("Tiempo preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());


        System.out.print("Dificultada (Facil/Medio/Difil): ");
        var dicficultad = consola.nextLine();


        System.out.println("\n*** Receta de Cocina ***");
        System.out.println("\tNombre Receta = " + nombreReceta);
        System.out.println("\tIngredientes = " + ingredientes);
        System.out.println("\tTiempoPreparacion = " + tiempoPreparacion + " minutos");
        System.out.println("\tDicficultad = " + dicficultad);


    }

}
