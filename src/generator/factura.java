package generator;
import java.util.Date;

public class factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private cliente cliente;
    private itemFactura[] items;

    //getter and setters


    //Folio
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    //Descripcion

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Fecha

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Cliente

    public generator.cliente getCliente() {
        return cliente;
    }

    public void setCliente(generator.cliente cliente) {
        this.cliente = cliente;
    }

    //ItemFcatura


    public itemFactura[] getItems() {
        return items;
    }

    public void setItems(itemFactura[] items) {
        this.items = items;
    }
}
