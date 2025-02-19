public class EjemploOrdenDeCompraRelacionesObjetos {
    public static void main(String[] args) {

        Cliente adrianHernandez = new Cliente
                ("Adrían Alberto", "Hernandéz", "Lozoya");
        Cliente merlinPeiro = new Cliente
                ("Merlín", "Peiro", "Chucuán");
        Cliente jahirBelmont = new Cliente
                ("Jahir Alonso", "Belmont", "Sheinbaum");
        Cliente victoriaAstorga = new Cliente
                ("Víctoria Elizabeth", "Astorga", "Pacheco");
        Cliente humbertoBustillos = new Cliente
                ("Humberto Daniel", "Bustillos", "Váldez");
        Cliente franciscoZapata = new Cliente
                ("Francisco", "Zapata", "Meza");
        Cliente miguelJacaranda = new Cliente
                ("Miguel Filiberto", "Jacaranda", "Bolainas");
        Cliente pepeNador = new Cliente
                ("José María Unkas", "Lara", "Solano");
        Cliente milhouseVanHouten = new Cliente
                ("Milhouse", "Van Houten", "Van Halen");


        OrdenDeCompra orden1 = new OrdenDeCompra(
                TipoProducto.TAKIS_O, 3,.15, adrianHernandez
        );

        OrdenDeCompra orden2 = new OrdenDeCompra(
                TipoProducto.TAKIS_SB, 2
        );
        orden2.setImpuestos(orden2.getImpuestos());
        orden2.setCliente(merlinPeiro);

        OrdenDeCompra orden3= new OrdenDeCompra(
                TipoProducto.TAKIS_F, 5, jahirBelmont
        );

        TipoProducto producto4 = TipoProducto.CHIPS_H;
        OrdenDeCompra orden4 = new OrdenDeCompra(
                producto4, 2, .15, victoriaAstorga
        );

        OrdenDeCompra orden5 = new OrdenDeCompra();
        orden5.setProducto(TipoProducto.CHIPS_F);
        orden5.setCantidad(5);
        orden5.setImpuestos(orden5.getImpuestos());
        orden5.setCliente(humbertoBustillos);




        System.out.println(orden1.verDetalle());
        System.out.println(orden2.verDetalle());
        System.out.println(orden3.verDetalle());
        System.out.println(orden4.verDetalle());
        System.out.println(orden5.verDetalle());


    }
}
