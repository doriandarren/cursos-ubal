import java.util.Scanner;

public class SistemaEmpleados {


    public static void main(String[] args) {

        System.out.println("*** Employee System ***");


        var consola = new Scanner(System.in);

        System.out.print("Nombre: ");
        var employeeName = consola.nextLine();

        System.out.print("Edad: ");
        var employeeAge = Integer.parseInt(consola.nextLine());


        System.out.print("Salario: ");
        var employeeSalary = Double.parseDouble(consola.nextLine());

        System.out.print("Es jefe (true/false)?: ");
        var isManager = Boolean.parseBoolean(consola.nextLine());


        //Imprimir
        System.out.println("\nDatos del empleado: ");
        System.out.println("\temployeeName = " + employeeName);
        System.out.println("\temployeeAge = " + employeeAge);
        System.out.printf("\temployeeSalary = $%.2f%n", employeeSalary);
        System.out.println("\tisManager = " + isManager);



    }


}
