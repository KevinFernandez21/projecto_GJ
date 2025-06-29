package projecto_gj.modelo;

import java.util.Date;

public class HistorialPrecio {
    private double precio_float;
    private Date fecha_date_time;
    
    public HistorialPrecio(double precio, Date fecha) {
        this.precio_float = precio;
        this.fecha_date_time = fecha;
    }
    
    // Getters y setters
    public double getPrecio_float() { return precio_float; }
    public void setPrecio_float(double precio_float) { this.precio_float = precio_float; }
    public Date getFecha_date_time() { return fecha_date_time; }
    public void setFecha_date_time(Date fecha_date_time) { this.fecha_date_time = fecha_date_time; }
}
