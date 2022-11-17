public class InvoicePrinter {
    public void print (Invoice invoice){
    System.out.print("Factura: " + invoice.getCode() + " | " + invoice.getSale() );

    }
}
