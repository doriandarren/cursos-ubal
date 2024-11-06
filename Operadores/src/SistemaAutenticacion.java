import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {


        var consola = new Scanner(System.in);

        final var USUARIO_SISTEMA = "admin";
        final var PASSWORD_SISTEMA = "123";

        System.out.print("Usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Contraseña: ");
        var password = consola.nextLine();


        var resultado = usuario.equals(USUARIO_SISTEMA) && password.equals(PASSWORD_SISTEMA);

        System.out.println("Resultado = " + resultado);


    }
}
