package projecto_gj.modelo;

import projecto_gj.modelo.enums.*;
import java.util.List;
import java.util.Date;

public class Factura {
    private Date fecha_Date_time;
    private Cliente cliente;
    
    public Factura(Date fecha, Cliente cliente) {
        this.fecha_Date_time = fecha;
        this.cliente = cliente;
    }
    
    public void generar_Factura(List<Orden> ordenes) {
        System.out.println("Generando factura para cliente: " + cliente.getNombre());
        double total = 0;
        for(Orden orden : ordenes) {
            total += orden.getTotal();
        }
        // Si es cliente empresarial, agregar $50 mensuales
        if(cliente.getTipo() == TipoCliente.EMPRESARIAL) {
            total += 50.0;
        }
        System.out.println("Total de la factura: $" + total);
    }
    
    // Getters y setters
    public Date getFecha_Date_time() { return fecha_Date_time; }
    public void setFecha_Date_time(Date fecha_Date_time) { this.fecha_Date_time = fecha_Date_time; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
