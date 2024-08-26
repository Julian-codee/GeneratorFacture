package generator;

public class producto {
    private String codigo;
    private String nombre;
    private double precio;


    private static int ultimoCodigo;

    public producto(String nombre , double precio){
    ultimoCodigo++;
    this.codigo = "P" + String.format("%05d, ultimoCodigo");
    this.nombre = nombre;
    this.precio = precio;
    }

    //Getters and setters

    //codigo

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //Nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Precio

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //* Devuelve una representación en cadena del producto.

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
