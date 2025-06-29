package projecto_gj.modelo;

public class Proveedor extends Persona {
     private String descripcion;
    
    public Proveedor(String descripcion, int id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.descripcion = descripcion;
    }
    
    // Implementación de métodos abstractos
    @Override
    public void leer_archivos() {
        System.out.println("Leyendo archivos de proveedor: " + nombre);
    }
    
    @Override
    public void escribir_archivos() {
        System.out.println("Escribiendo archivos de proveedor: " + nombre);
    }
    
    // Métodos específicos de Proveedor
    public void agregar_proveedor(Proveedor proveedor) {
        System.out.println("Proveedor agregado: " + proveedor.getNombre());
    }
    
    public void editar_proveedor(Proveedor proveedor) {
        System.out.println("Proveedor editado: " + proveedor.getNombre());
    }
    
    public void falta_insumos(String descripcion, Proveedor proveedor) {
        System.out.println("Registrando falta de insumos: " + descripcion + " para proveedor: " + proveedor.getNombre());
    }
    
    // Getters y setters específicos
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    @Override
    public String to_string() {
        return String.format("ID: %d | Nombre: %s | Teléfono: %d | Descripción: %s",
                id, nombre, telefono, descripcion);
    }
}
