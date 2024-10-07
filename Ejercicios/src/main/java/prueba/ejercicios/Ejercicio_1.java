package prueba.ejercicios;

public class Ejercicio_1 {

String nombre;
int edad;
String genero;


    public Ejercicio_1(String nombre, int edad, String genero ) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        
        // Crear una instancia de ConstructorDestructor
       Ejercicio_1 persona = new Ejercicio_1("Maria", 15, "Mujer");
        System.out.println("El nombre del@ Estudiante es: " + persona.getNombre() + ", La edad del@ Estudiante es: " + persona.getEdad() + ", El genero del@ Estudiante es: " + persona.getGenero());
    }
    
    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
// getter para edad
    public int getEdad() {
        return edad;
    }
    
    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para genero
    public String getGenero() {
        return genero;
    }

    // Setter para genero
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
