package Work;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem c1 = new InvoiceItem();
        System.out.println("ID: " + c1.getID());
        System.out.println("desc: " + c1.getDesc());
        System.out.println("qty: " + c1.getQty());
        System.out.println("unitPrice: " + c1.getUnitPrice());

        InvoiceItem c2 = new InvoiceItem();
        System.out.println("Invoice: " + c2.getToTal());
        System.out.println(c2.toString());
    }
}
