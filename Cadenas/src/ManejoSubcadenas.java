public class ManejoSubcadenas {

    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        var subcadena1 = cadena1.substring(0, 6);
        System.out.println("subcadena1 = " + subcadena1);
        
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);



    }

}
