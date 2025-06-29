package projecto_gj.modelo;

public class DetalleServicio {
    private int cantidad;
    private Servicio servicio;
    
    public DetalleServicio(Servicio servicio, int cantidad) {
        this.servicio = servicio;
        this.cantidad = cantidad;
    }
    
    // Getters y setters
    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    
    public double getSubtotal() {
        return servicio.getPrecio() * cantidad;
    }
}
