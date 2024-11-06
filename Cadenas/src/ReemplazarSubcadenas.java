public class ReemplazarSubcadenas {
    public static void main(String[] args) {

        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);


        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);


    }
}
