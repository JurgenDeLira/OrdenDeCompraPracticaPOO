public enum Marca {
    BARCEL("Barcel"),
    SABRITAS("Sabritas");

    private final String nombre;

    Marca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
