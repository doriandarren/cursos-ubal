public class ReservaHoteles {
    
    public static void main(String[] args) {

        var nombreCliente = "Miguel Flores";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaAlMar = true;


        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        diasEstancia = 5;
        tarifaDiaria = 900.00;
        tieneVistaAlMar = false;

        System.out.println();
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);


    }
}
