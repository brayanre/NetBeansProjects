
package prueba.ejercicios;

public class Ejercicio_10 {
 private String nombreProducto;
    private String categoria;
    private double precio;
    private int cantidad;
    private String proveedor;
    
 public Ejercicio_10(String nombreProducto, String categoria, double precio, int cantidad, String proveedor) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Proveedor: " + proveedor);
    }

    public static void main(String[] args) {
        Ejercicio_10 producto1 = new Ejercicio_10("Leche", "Lácteos", 12000, 50, "Lácteos S.A.");
        Ejercicio_10 producto2 = new Ejercicio_10("Arroz", "Granos", 7000, 100, "Granos del Campo");

        producto1.mostrarInformacion();
        System.out.println();
        producto2.mostrarInformacion();
    }   
    
}
