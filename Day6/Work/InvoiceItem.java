package Work;

public class InvoiceItem {
    private String ID, desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(){
        ID = "1";
        desc = "bread";
        qty = 12;
        unitPrice = 6.5;
    }
    public String getID(){return ID;}
    public String getDesc(){return desc;}
    public int getQty(){return qty;}
    public void setQty(int newQty){qty = newQty;}
    public double getUnitPrice(){return unitPrice;}
    public void setUnitPrice(double newUnitPrice){unitPrice = newUnitPrice;}
    public double getToTal(){return unitPrice * qty;}
    public String toString(){return "InvoiceItem[ID = " + ID + " desc = " + desc + " qty = " + qty + " unitPrice = " + unitPrice;}
}
