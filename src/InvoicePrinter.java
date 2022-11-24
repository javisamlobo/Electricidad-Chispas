public class InvoicePrinter {
    public void print(Invoice invoice){
    System.out.println("Factura: " + invoice.getCode() + " | " + invoice.getDate() );
    System.out.println("Cliente: " + invoice.getClient().getId() + " | " + invoice.getClient().getName() + " | " + invoice.getClient().getTown() + " | " + invoice.getClient().getProvince() + " | " + invoice.getClient().getEmail());
    System.out.println("Linea venta (producto / servicio): " + invoice.getSale().getCode() + " | " + invoice.getSale().getname() + " | " + invoice.getSale().getPrice()+ " | " + invoice.getSale().getIva() + " | " + invoice.getTotal());
    System.out.println("Total: " + invoice.getTotal());
    }
}
