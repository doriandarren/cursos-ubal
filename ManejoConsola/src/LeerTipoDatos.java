import java.util.Scanner;

public class LeerTipoDatos {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        consola.nextLine();

        System.out.print("Altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        consola.nextLine();


        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);


        System.out.print("Valor entero: ");

        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);


        System.out.print("Valor float: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);






    }



}
