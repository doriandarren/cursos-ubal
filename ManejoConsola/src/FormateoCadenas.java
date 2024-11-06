public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");

        var nombre = "Mathias";
        var edad = 35;
        var salario = 21000.50;

        //String
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);


        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;


        // Block
        mensaje = """
                %nDetalle Persona: \s
                ------------------
                \tNombre: %s
                \tNo. empleados: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado,  edad, salario);

        System.out.println(mensaje);


        System.out.printf("""
                %nDetalle Persona: \s
                ------------------
                \tNombre: %s
                \tNo. empleados: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado,  edad, salario);

    }
}
