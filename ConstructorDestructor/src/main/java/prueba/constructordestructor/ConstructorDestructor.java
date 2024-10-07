package prueba.constructordestructor;

public class ConstructorDestructor {
    String nombre;
    int edad;
    int power;
    int skills;
    
    // Constructor de ConstructorDestructor
    public ConstructorDestructor(String nombre, int edad, int poder, int habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.power = poder;
        this.skills = habilidades;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido de nuevo, AMO Supremo, (Perencejo)");
        System.out.println("");
        
        // Crear una instancia de ConstructorDestructor
        ConstructorDestructor persona = new ConstructorDestructor("Perencejo", 3000, 1000000, 70000);
        System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad + " Años" + ", Poder: " + persona.power + ", Nº habilidades: " + persona.skills);
    }
}

// CONSTRUCTOR
//Un constructor es un método especial que se llama automáticamente cuando se crea una instancia de una clase. 
//Su propósito es inicializar los atributos del objeto. Un constructor tiene el mismo nombre que la clase y no 
//tiene un tipo de retorno (ni siquiera void).

// THIS
//this es una referencia a la instancia actual de la clase. Se utiliza para distinguir entre los atributos de 
//la instancia y los parámetros del método o constructor que tienen el mismo nombre.


// DESTRUCTOR
//Java no tiene destructores en el mismo sentido que otros lenguajes como C++. Sin embargo, puedes usar el método finalize(), 
//que se llama antes de que un objeto sea recolectado por el recolector de basura. Sin embargo, su uso no es común y generalmente 
//no se recomienda, ya que el recolector de basura maneja la memoria automáticamente.

// Finalize
//El método finalize() existía en versiones anteriores de Java y se podía sobreescribir para realizar alguna limpieza 
//antes de que un objeto fuera recolectado, pero su uso no es recomendado y ha sido marcado como obsoleto desde Java 9. 
//En lugar de depender de finalize(), se sugiere usar otros enfoques para la limpieza de recursos, como:
//    -Try-with-resources para manejar recursos como archivos y conexiones de red.
//    -Métodos de cierre explícitos en tus clases, que puedes llamar manualmente para liberar recursos.