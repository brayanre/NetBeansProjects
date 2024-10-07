package prueba.ejercicios;
 
public class Ejercicio_8 {
private String tipo;
private String empresa;
private double tarifa;
private String origen;
private String destino;        
        
    public Ejercicio_8 (String tipo, String empresa, double tarifa, String origen, String destino) {
        this.tipo = tipo;
        this.empresa = empresa;
        this.tarifa = tarifa;
        this.origen = origen;
        this.destino = destino;  
        }
    public void mostrarInformacion() {
        System.out.println("Tipo de Transporte: " + tipo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Tarifa: $" + tarifa);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
    }

    public static void main(String[] args) {
        Ejercicio_8 aereo = new Ejercicio_8("Aéreo", "Aerolíneas XYZ", 150.0, "Ciudad A", "Ciudad B");
        Ejercicio_8 terrestre = new Ejercicio_8("Terrestre", "Transportes ABC", 50.0, "Ciudad C", "Ciudad D");
        Ejercicio_8 acuatico = new Ejercicio_8("Acuático", "Navegaciones 123", 100.0, "Puerto A", "Puerto B");

        aereo.mostrarInformacion();
        System.out.println();
        terrestre.mostrarInformacion();
        System.out.println();
        acuatico.mostrarInformacion();
    } 
}
