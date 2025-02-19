import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
    private int id;
    private List<ItemOrden> items;
    private TipoProducto producto;
    private int cantidad;
    private Double impuestos = .15;
    private Cliente cliente;

    private static int ultimoId = 1;

    //Constructor
    public OrdenDeCompra(){
        this.id = ++ultimoId;
        this.items = new ArrayList<>(); //  Asegurar que la lista se inicializa
    }

    public OrdenDeCompra(TipoProducto producto, int cantidad) {
        this();
        this.producto = producto;
        this.cantidad = cantidad;
        this.items = new ArrayList<>(); //  Inicializar lista aquí también
    }

    public OrdenDeCompra(TipoProducto producto, int cantidad, Double impuestos) {
        this(producto, cantidad);
        this.impuestos = impuestos;
    }

    public OrdenDeCompra(TipoProducto producto, int cantidad, Double impuestos, Cliente cliente) {
        this(producto, cantidad, impuestos);
        this.cliente = cliente;
    }

    public OrdenDeCompra(TipoProducto producto, int cantidad, Cliente cliente) {
        this(producto, cantidad, 0.15, cliente);
    }

    public OrdenDeCompra(Cliente cliente) {
        this(); //  Llamar al constructor base que inicializa `items`
        this.cliente = cliente;
    }

    // Getter Setter o leer asignar


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoProducto getProducto() {
        return producto;
    }

    public void setProducto(TipoProducto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Métodos
    public double agregarImpuesto() {
        double precioBase = producto.getPrecio();
        double precioConImpuesto = precioBase + (precioBase * this.impuestos);
        return precioConImpuesto;
    }

    public void agregarProducto(TipoProducto producto, int cantidad, double impuesto) {
        items.add(new ItemOrden(producto, cantidad, impuesto));
    }

    public double calcularTotal() {
        return items.stream().mapToDouble(ItemOrden::calcularSubtotal).sum();
    }

    public String verDetalle(){
        StringBuilder detalle = new StringBuilder("Orden ID: " + id + "\nCliente: " + cliente + "\nProductos:\n");
        for (ItemOrden item : items) {
            detalle.append(" - ").append(item).append("\n");
        }
        detalle.append("Total: ").append(calcularTotal());
        return detalle.toString();
    }

    @Override
    public String toString() {
        return "OrdenDeCompra " +
                "id=" + id +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", impuestos=" + impuestos +
                ", cliente=" + cliente;
    }
}
