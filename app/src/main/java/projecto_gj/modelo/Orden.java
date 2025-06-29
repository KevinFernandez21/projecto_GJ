package projecto_gj.modelo;

import java.util.List;
import projecto_gj.modelo.enums.TipoAutomovil;

public class Orden {
    private static int contadorNumero = 1;
    private int numero;
    private Cliente cliente;
    private String fecha_Date_time;
    private TipoAutomovil tipo_de_automovil;
    private String placa_vehiculo;
    private List<DetalleServicio> detalles;
    private Tecnico tecnico;
    
    public Orden(Cliente cliente, String fechaServicio, TipoAutomovil tipoVehiculo, 
                String placaVehiculo, List<DetalleServicio> detalles, Tecnico tecnico) {
        this.numero = contadorNumero++;
        this.cliente = cliente;
        this.fecha_Date_time = fechaServicio;
        this.tipo_de_automovil = tipoVehiculo;
        this.placa_vehiculo = placaVehiculo;
        this.detalles = detalles;
        this.tecnico = tecnico;
    }
    
    // Método para generar orden de orden
    public void generar_orden(Orden orden) {
        System.out.println("Generando orden: " + orden.getNumero());
    }
    
    // Getters y setters
    public int getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public String getFecha_Date_time() { return fecha_Date_time; }
    public void setFecha_Date_time(String fecha_Date_time) { this.fecha_Date_time = fecha_Date_time; }
    public TipoAutomovil getTipo_de_automovil() { return tipo_de_automovil; }
    public void setTipo_de_automovil(TipoAutomovil tipo_de_automovil) { this.tipo_de_automovil = tipo_de_automovil; }
    public String getPlaca_vehiculo() { return placa_vehiculo; }
    public void setPlaca_vehiculo(String placa_vehiculo) { this.placa_vehiculo = placa_vehiculo; }
    public List<DetalleServicio> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleServicio> detalles) { this.detalles = detalles; }
    public Tecnico getTecnico() { return tecnico; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }
    
    public double getTotal() {
        return detalles.stream().mapToDouble(DetalleServicio::getSubtotal).sum();
    }
    
    @Override
    public String toString() {
        return String.format("Orden #%d | Cliente: %s | Fecha: %s | Vehículo: %s %s | Total: $%.2f",
                numero, cliente.getNombre(), fecha_Date_time, tipo_de_automovil, placa_vehiculo, getTotal());
    }
}
