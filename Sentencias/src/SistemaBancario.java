import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Desea salir en el sistema? (true/false): ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if(!salirSistema){
            System.out.println("Sigue en el sistema");
        }else{
            System.out.println("Hasta luego!!!");
        }



    }
}
