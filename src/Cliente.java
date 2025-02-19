public class Cliente {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Cliente(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }
}
