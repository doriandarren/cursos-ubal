public class MasContenacion {

    public static void main(String[] args) {

        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " +cadena2;
        System.out.println("cadena3 + = " + cadena3);

        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 concat = " + cadena3);

        var constructorCadenas = new StringBuilder();

        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        var resultado = constructorCadenas.toString();

        System.out.println("constructorCadenas = " + resultado);


        var stringBuffer = new StringBuffer();

        stringBuffer.append(cadena1).append(" ").append(cadena2);
        
        resultado = stringBuffer.toString();

        System.out.println("resultado = " + resultado);



        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado = " + resultado);



    }

}
