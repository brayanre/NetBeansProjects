package prueba.ejercicios;
import java.util.Scanner;

public class Ejercicio_7 {    
private String cargo;
private String empresa;
private String localizacion;
private String N_correo;
private int N_telefono;        
        
    public Ejercicio_7 (String cargo, String empresa, String localizacion, String N_correo, int N_telefono) {
        Scanner sc = new Scanner(System.in);
        this.cargo = cargo;
        this.empresa = empresa;
        this.localizacion = localizacion;
        this.N_correo = N_correo;
        this.N_telefono = N_telefono; 
        
    System.out.println("Bienvenido a la pagina oficial de soporte y asesoramiento de microsoft colombia");
    System.out.println("");
    try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("¿En que lo podemos ayudar?");
    System.out.println("");
    try {
            Thread.sleep(1000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("1 = (Rendimiento lento)");
    System.out.println("2 = (Errores de actualización)");
    System.out.println("3 = (Problemas de conectividad)");
    System.out.println("4 = (Bloqueos o congelamientos)");
    System.out.println("5 = (Problemas de impresión)");
    System.out.println("6 = (Errores de pantalla azul (BSOD))");
    System.out.println("7 = (Virus y malware)");
    System.out.println("8 = (Problemas de sonido)");
    System.out.println("9 = (Dificultades con aplicaciones)");
    System.out.println("10 = (Problemas de seguridad)");   
    System.out.println("11 = (no es mi problema)");
    
    int opcion = sc.nextInt();    
    switch (opcion) {
            case 1:
                System.out.println("");
                System.out.println("CAUSAS: Programas en segundo plano, falta de espacio en disco, malware.");
                System.out.println("");
                System.out.println("SOLUCIONES: Limpiar el disco, desactivar programas de inicio, escanear en busca de malware.");
                break;
            case 2: 
                System.out.println("");
                System.out.println("CAUSAS: Conexiones inestables, conflictos con programas, espacio insuficiente.");
                System.out.println("");
                System.out.println("SOLUCIONES: Verificar la conexión a Internet, liberar espacio, reinstalar actualizaciones fallidas.");
                break;
            case 3:   
                System.out.println("");
                System.out.println("CAUSAS: Controladores de red desactualizados, configuraciones incorrectas.");
                System.out.println("");
                System.out.println("SOLUCIONES: Actualizar controladores, restablecer configuraciones de red.");
                break;
            case 4:      
                System.out.println("");
                System.out.println("CAUSAS: Conflictos de software, hardware defectuoso.");
                System.out.println("");
                System.out.println("SOLUCIONES: Reiniciar el sistema, actualizar controladores, verificar hardware.");
                break;
            case 5:    
                System.out.println("");
                System.out.println("CAUSAS: Controladores de impresora desactualizados, conexiones incorrectas.");
                System.out.println("");
                System.out.println("SOLUCIONES: Reinstalar controladores de impresora, verificar conexiones y configuraciones.");
                break;
            case 6:   
                System.out.println("");
                System.out.println("CAUSAS: Problemas de hardware, controladores incompatibles.");
                System.out.println("");
                System.out.println("SOLUCIONES: Revisar hardware, actualizar controladores, ejecutar diagnósticos de memoria.");
                break;
            case 7:   
                System.out.println("");
                System.out.println("CAUSAS: Navegar en sitios inseguros, abrir correos sospechosos.");
                System.out.println("");
                System.out.println("SOLUCIONES: Usar un buen antivirus, mantener el sistema y el software actualizados.");
                break;
            case 8: 
                System.out.println("");
                System.out.println("CAUSAS: Controladores de audio desactualizados, configuraciones incorrectas.");
                System.out.println("");
                System.out.println("SOLUCIONES: Actualizar controladores de audio, revisar configuraciones de sonido.");
                break; 
            case 9:   
                System.out.println("");
                System.out.println("CAUSAS: Incompatibilidades, archivos dañados.");
                System.out.println("");
                System.out.println("SOLUCIONES: Actualizar o reinstalar aplicaciones, comprobar requisitos del sistema.");
                break;
            case 10:
                System.out.println("");                
                System.out.println("CAUSAS: Contraseñas débiles, falta de actualizaciones.");
                System.out.println("");
                System.out.println("SOLUCIONES: Usar contraseñas fuertes, activar la autenticación en dos pasos, mantener el sistema actualizado.");
                break;    
            default:
                System.out.println("");
                System.out.println("si tienes otra duda, o no encuentras tu problema, puedes contactarnos con el siguiente correo: support@microsoft.com");
                break;
        }       
    }
    public void mostrarInformacion() {
        System.out.println("");
        System.out.println("");
        try {
            Thread.sleep(10000); // Espera 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Perfil de la empresa a la quiero aplicar");
        System.out.println("");
        System.out.println("Cargo: " + cargo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Localizacion: " + localizacion);
        System.out.println("N_correo: " + N_correo);
        System.out.println("N_telefono: " + N_telefono);
    }
    public static void main(String[] args) {
    Ejercicio_7 contrato = new Ejercicio_7("Programador", "Microsoft Colombia", "Calle 92 # 11 – 51 Piso 10​", "connect@microsoft.com", 713264700);
        
    contrato.mostrarInformacion();
    System.out.println();
    }
}
