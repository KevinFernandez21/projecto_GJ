package projecto_gj.modelo;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private static int contadorCodigo = 1;
    private int codigo;
    private String nombre;
    private double precio;
    private List<Double> historialPrecios;
    
    public Servicio(String nombre, double precio) {
        this.codigo = contadorCodigo++;
        this.nombre = nombre;
        this.precio = precio;
        this.historialPrecios = new ArrayList<>();
        this.historialPrecios.add(precio);
    }
    
    // Getters y setters
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { 
        this.historialPrecios.add(precio);
        this.precio = precio; 
    }
    public List<Double> getHistorialPrecios() { return historialPrecios; }
    
    @Override
    public String toString() {
        return String.format("Código: %d | Nombre: %s | Precio: $%.2f",
                codigo, nombre, precio);
    }
}
