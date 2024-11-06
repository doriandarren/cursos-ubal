import java.util.Scanner;

public class VlorPositivo {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Número:");
        var numero = Integer.parseInt(consola.nextLine());

        if(numero > 0){
            System.out.println("Es positivo: " + numero);
        }else if(numero < 0){
            System.out.println("Es negativo: " + numero);
        }else{
            System.out.println("Es cero: " + numero);
        }
    }
}
