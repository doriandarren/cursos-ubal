public class TiendaLinea {
    public static void main(String[] args) {


        System.out.println("*** Tienda en Linea (Detalle Producto)***");

        String nombreProducto = "Laptop HP";
        double precioProducto = 1000.50;
        int cantidadDisponible = 15;
        boolean disponibleVenta = true;


        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);


        nombreProducto = "Laptop HP x360 Spectre";
        precioProducto = 900.50;
        cantidadDisponible = 0;
        disponibleVenta = false;

        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);


    }
}
