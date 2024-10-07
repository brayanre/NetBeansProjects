
package prueba.set_y_get;

public class SET_y_GET {
    private String nombre;
    private int edad;
    
    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}


//Los métodos setter (set) y getter (get) son utilizados para acceder y modificar los atributos privados de una clase. 
//Esto es parte de la encapsulación, que es uno de los principios de la programación orientada a objetos.
//   -Getter: Un método que devuelve u obtiene el valor de un atributo.
//   -Setter: Un método que establece o modifica el valor de un atributo.