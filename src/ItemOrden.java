import java.util.Objects;

public class ItemOrden {

    private TipoProducto producto;
    private int cantidad;
    private double impuesto;

    public ItemOrden(TipoProducto producto, int cantidad, double impuesto) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.impuesto = impuesto;
    }

    public TipoProducto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double calcularSubtotal() {
        double precioBase = producto.getPrecio();
        return cantidad * (precioBase + (precioBase * impuesto));
    }

    @Override
    public String toString() {
        return "Producto" + producto.getNombre() +
                ", Cantidad: " + cantidad +
                ", Impuesto: " + impuesto +
                ", Subtotal: " + calcularSubtotal();
    }
}
