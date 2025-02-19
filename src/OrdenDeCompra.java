public class OrdenDeCompra {
    private int id;
    private TipoProducto producto;
    private int cantidad;
    private Double impuestos = .15;
    private Cliente cliente;

    private static int ultimoId;

    //Constructor
    public OrdenDeCompra(){
        this.id = ++ ultimoId;
    }

    public OrdenDeCompra(TipoProducto producto, int cantidad) {
        this(); //Llama al constructor base para asignar el ID
        this.producto = producto;
        this.cantidad = cantidad;
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
    } // este es para cuando no quieres poner el impuesto en una orden y te de el 15

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

    public double calcularTotal() {
        return cantidad * agregarImpuesto();
    }

    public String verDetalle(){
        String detalle = "orden.id = " + this.id +
                "\norden.producto = " + this.getProducto().getNombre() +
                "\norden.cantidad = " + this.getCantidad() +
                "\norden.precio base = " + this.getProducto().getPrecio();
        if (this.getImpuestos() != null) {
            detalle +=  "\norden.impuestos = " + this.getImpuestos();
        }
        detalle += "\norden.cliente = " + this.getCliente() +
                "\norden.precio con impuesto = " + this.agregarImpuesto() +
                "\norden.total = " + this.calcularTotal();
        return detalle;
    }

}
