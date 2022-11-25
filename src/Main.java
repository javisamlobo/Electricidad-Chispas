public class Main {
    public static void main(String[] args) {
        InvoicePrinter invoicePrinter = new InvoicePrinter();

        Autonomous autonomo = new Autonomous();
        autonomo.setId("70562154J");
        autonomo.setName("Pepe");
        autonomo.setSurname("Perez");
        autonomo.setPostalCode(05002);
        autonomo.setTown("Ávila");
        autonomo.setProvince("Ávila");
        autonomo.setTelephone(920565458);
        autonomo.setEmail("pepeperez@gmail.com");

        Corporation sociedad = new Corporation();
        sociedad.setId("B-89654215");
        sociedad.setName("Innovation.SL");
        sociedad.setEmail("atencion@inno.com");
        sociedad.setTelephone(615489856);
        sociedad.setTown("Ávila");
        sociedad.setProvince("Ávila");
        sociedad.setPostalCode(05001);

        Product producto = new Product();
        producto.setCode("bn45");
        producto.setName("Remo");
        producto.setBrand("Arvine");
        producto.setModel("Bmsed");
        producto.setIva("Tipo 21");
        producto.setPrice(100);

        Service servicio = new Service();
        servicio.setCode("imjjd45");
        servicio.setName("Actualizacion");
        servicio.setPrice(125);
        servicio.setIva("Tipo 4");

        Invoice factura = new Invoice();
        factura.setCode("oct25112022001");
        factura.setDate("25/11/2022");
        factura.setClient(autonomo);
        factura.setSale(producto);
        factura.setTaxBase(100);
        factura.setTotal(121);

        invoicePrinter.print(factura);
    }
}