package prueba.ejercicios;

public class Ejercicio_9 {
private String nombrePaquete;
    private String destino;
    private double precio;
    private int duracion; // en días
    private String incluye;

public Ejercicio_9(String nombrePaquete, String destino, double precio, int duracion, String incluye) {
        this.nombrePaquete = nombrePaquete;
        this.destino = destino;
        this.precio = precio;
        this.duracion = duracion;
        this.incluye = incluye;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Paquete: " + nombrePaquete);
        System.out.println("Destino: " + destino);
        System.out.println("Precio: $" + precio);
        System.out.println("Duración: " + duracion + " días");
        System.out.println("Incluye: " + incluye);
    }

    public static void main(String[] args) {
        Ejercicio_9 paquete1 = new Ejercicio_9("Aventura en la Playa", "Cancún", 1200.0, 7, "Alojamiento, Desayunos");
        Ejercicio_9 paquete2 = new Ejercicio_9("Cultura en Europa", "Italia", 2500.0, 14, "Alojamiento, Comidas, Tours");

        paquete1.mostrarInformacion();
        System.out.println();
        paquete2.mostrarInformacion();
    }   
}
