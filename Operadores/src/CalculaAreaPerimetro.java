import java.util.Scanner;

public class CalculaAreaPerimetro {
    public static void main(String[] args) {


        var consola = new Scanner(System.in);

        System.out.print("Base: ");
        var base = Integer.parseInt(consola.nextLine());


        System.out.print("ALtura: ");
        var altura = Integer.parseInt(consola.nextLine());


        var area = base * altura;
        System.out.println("Area = " + area);

        var perimetro = 2 * (base + altura);
        System.out.println("Perimetro = " + perimetro);


    }
}
