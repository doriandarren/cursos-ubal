public class OperatorTernario {
    public static void main(String[] args) {

        var numero = 54647582;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("el numero: "  + numero +" es: " + resultado);


        var edad = 17;
        var mensaje =  (edad >= 18) ? "Eres mayol mi tio" : "Tremendo menol";
        System.out.println(mensaje);

    }
}
