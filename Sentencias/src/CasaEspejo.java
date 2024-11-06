import java.util.Scanner;

public class CasaEspejo {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene miedo a la oscuridad? (true/false): ");
        var tieneMiedo = Boolean.parseBoolean(consola.nextLine());

        if(edad >= 10 && !tieneMiedo){
            System.out.println("Cumples con la condición de entrar!!!");
        }else{
            System.out.println("Lo sentimos no cumples las condiciones :(");
        }

    }
}
