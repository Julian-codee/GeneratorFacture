package generator;

public class itemFactura {
    private producto producto;
    private int cantidad;

    //Getters and setters

    //Producto
    public generator.producto getProducto() {
        return producto;
    }

    public void setProducto(generator.producto producto) {
        this.producto = producto;
    }

    //Cantidad
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
