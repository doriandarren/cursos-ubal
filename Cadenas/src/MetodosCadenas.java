public class MetodosCadenas {

    public static void main(String[] args) {

        var cadena1 = "Hola mundo";


        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);


        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);


        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);


        System.out.println("minuscula = " + cadena1.toLowerCase());

        var cadena2 = " Leo Reyes  ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());





    }


}
