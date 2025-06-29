package projecto_gj.modelo;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected int telefono;
    
    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = Integer.parseInt(telefono);
    }
    
    // Métodos abstractos
    public abstract void leer_archivos();
    public abstract void escribir_archivos();
    
    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
    
    public abstract String to_string();
}
