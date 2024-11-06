public class OperadoresUnarios {

    public static void main(String[] args) {

        int a = 3, b = -2, resultado;
        var c = true;

        // +
        resultado = +a;
        System.out.println("resutado = " + resultado);

        // -
        resultado = -a;
        System.out.println("resultado = " + resultado);

        // incemnto y decremento
        //Pre incremento
        resultado = ++a;
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);

        //Post incremento
        a = 3;
        resultado = a++;
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);


        // Pre decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado = " + resultado);
        System.out.println("b = " + b);

        // Post decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado = " + resultado);
        System.out.println("b = " + b);


    }
}
