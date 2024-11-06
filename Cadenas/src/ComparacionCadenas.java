public class ComparacionCadenas {

    public static void main(String[] args) {

        var cadena1 = "Java";
        var cadena2 = "Java";
        var caden3 = new String("Java");


        // compara referencia (==)
        System.out.println("cadena1 es igual en referencia a caden2");
        System.out.println(cadena1 == cadena2);

        System.out.print("cadena1 == referencia cadena3:");
        System.out.println(cadena1 == caden3);


        System.out.println("cadena1 es igual en contenido a caden3");
        System.out.println(cadena1.equals(caden3));




    }

}
