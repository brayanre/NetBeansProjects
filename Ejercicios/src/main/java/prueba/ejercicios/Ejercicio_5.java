
package prueba.ejercicios;


public class Ejercicio_5 {
    // Atributos
    private String nombre;
    private String matricula;
    private double nota;

    // Constructor
    public Ejercicio_5(String nombre, String matricula, double nota) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Método para verificar si el estudiante aprueba
    public boolean aprobar() {
        return this.nota >= 5;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
        System.out.println("Estado: " + (aprobar() ? "Aprobado" : "Reprobado"));
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Ejercicio_5 persona = new Ejercicio_5("Juan Pérez", "123456", 7.5);
        persona.mostrarInformacion();
    }


}
