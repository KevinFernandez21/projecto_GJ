package projecto_gj.modelo;

import java.util.Date;

public class Tecnico extends Persona {
    private String especialidad;
    
    public Tecnico(long id, String nombre, String telefono, String especialidad) {
        super(id, nombre, telefono);
        this.especialidad = especialidad;
    }
    
    // Implementación de métodos abstractos
    @Override
    public void leer_archivos() {
        System.out.println("Leyendo archivos de técnico: " + nombre);
    }
    
    @Override
    public void escribir_archivos() {
        System.out.println("Escribiendo archivos de técnico: " + nombre);
    }
    
    // Métodos específicos de Tecnico
    public void agregar_tecnico(Tecnico tecnico) {
        System.out.println("Técnico agregado: " + tecnico.getNombre());
    }
    
    public void editar_tecnico(Tecnico tecnico) {
        System.out.println("Técnico editado: " + tecnico.getNombre());
    }
    
    public void reporte_tecnico(Date tiempo) {
        System.out.println("Generando reporte para técnico: " + nombre + " en fecha: " + tiempo);
    }
    
    // Getters y setters específicos
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    @Override
    public String to_string() {
        return String.format("ID: %d | Nombre: %s | Teléfono: %d | Especialidad: %s",
                id, nombre, telefono, especialidad);
    }
}