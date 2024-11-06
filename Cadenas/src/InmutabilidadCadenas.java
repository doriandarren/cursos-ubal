public class InmutabilidadCadenas {
    public static void main(String[] args) {

        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);

        var caden2 = cadena1;

        cadena1 = "Adios";
        System.out.println("cadena1 modif = " + cadena1);
        System.out.println("caden2 = " + caden2);

    }
}
