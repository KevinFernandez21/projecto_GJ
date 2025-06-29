package projecto_gj.modelo;

import projecto_gj.modelo.enums.*;

public class Cliente extends Persona {
    private String direccion;
    private TipoCliente tipo;
    
    public Cliente(String direccion, TipoCliente tipo, String identificacion, String nombre, String telefono) {
        super(Integer.parseInt(identificacion), nombre, telefono);
        this.direccion = direccion;
        this.tipo = tipo;
    }
    
    // Implementación de métodos abstractos
    @Override
    public void leer_archivos() {
        // Implementación para leer archivos de clientes
        System.out.println("Leyendo archivos de cliente: " + nombre);
    }
    
    @Override
    public void escribir_archivos() {
        // Implementación para escribir archivos de clientes
        System.out.println("Escribiendo archivos de cliente: " + nombre);
    }
    
    // Métodos específicos de Cliente
    public void agregar_cliente(Cliente cliente) {
        System.out.println("Cliente agregado: " + cliente.getNombre());
    }
    
    public void editar_cliente(Cliente cliente) {
        System.out.println("Cliente editado: " + cliente.getNombre());
    }
    
    // Getters y setters específicos
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public TipoCliente getTipo() { return tipo; }
    public void setTipo(TipoCliente tipo) { this.tipo = tipo; }
    
    @Override
    public String to_string() {
        return String.format("ID: %d | Nombre: %s | Dirección: %s | Teléfono: %d | Tipo: %s",
                id, nombre, direccion, telefono, tipo);
    }
}
