public enum TipoProducto {

    TAKIS_O("Takis Originales", "Sabor principal", 360, Marca.BARCEL,13.00),
    TAKIS_SB("Takis Salsa Brava", "Sabor habanero", 360, Marca.BARCEL, 13.00),
    TAKIS_F("Takis Fuego", "Sabor chile y limón", 360,Marca.BARCEL, 12.00),
    CHIPS_H("Chips Habanero", "Sabor habanero", 400,Marca.BARCEL, 16.00),
    CHIPS_F("Chips Fuego", "Sabor chile y limón", 400,Marca.BARCEL, 16.00),
    RUFFLES_O("Ruffles Originales", "Sabor queso", 420,Marca.SABRITAS, 15.00),
    TOSTITOS_O("Tostitos Originales", "Sabor chile", 420, Marca.SABRITAS, 15.00),
    PAQUETAXO_O("Paquetaxo Original", "Incluye Rancheritos, Fritos, Cheetos Bolita y Sabritones", 700, Marca.SABRITAS, 34.00),
    PAQUETAXO_Q("Paquetaxo Queso", "Incluye Palomitas, Doritos 3D, Churrumais y Cheetos, todos sabor queso", 700, Marca.SABRITAS, 34.00);

    private final String nombre;
    private final String descripcion;
    private final int gramaje;
    private final Marca marca;
    private final double precio;

    TipoProducto(String nombre, String descripcion, int gramaje, Marca marca, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.gramaje = gramaje;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getGramaje() {
        return gramaje;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
}
