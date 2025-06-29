package projecto_gj.modelo;

// Clase abstracta Persona - CORREGIDA
public abstract class Persona {
    protected long id;        // Cambiado de int a long
    protected String nombre;
    protected long telefono;  // Cambiado de int a long
    
    public Persona(long id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = Long.parseLong(telefono);  // Cambiado a Long.parseLong
    }
    
    // Métodos abstractos
    public abstract void leer_archivos();
    public abstract void escribir_archivos();
    
    // Getters y setters - ACTUALIZADOS
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public long getTelefono() { return telefono; }
    public void setTelefono(long telefono) { this.telefono = telefono; }
    
    public abstract String to_string();
}
