
package prueba.constructordestructor;

public class Persona {
 int id;
 String nombre;
 String apellido;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     // getter para id
    public int getId() {
        return id;
    }
    
    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public String getApellido() {
        return apellido;
    }

    // Setter para edad
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
 
}
