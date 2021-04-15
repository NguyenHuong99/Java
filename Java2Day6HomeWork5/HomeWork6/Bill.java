package HomeWork6;

import java.io.Serializable;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    private String billCode;
    private String customerName;
    private String createDate;
    private float discount;
    private double totalPrice;

    public Bill(){
        super();
    }
    public Bill(String billCode, String customerName, String createDate, float discount, double totalPrice ){
        super();
        this.billCode = billCode;
        this.customerName = customerName;
        this.createDate = createDate;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }
    public String getBillCode(){
        return billCode;
    }
    public void setBillCode(String billCode){
        this.billCode = billCode;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCreateDate(){
        return createDate;
    }
    public void setCreateDate(String createDate){
        this.createDate =createDate;
    }
    public float getDiscount(){
        return discount;
    }
    public void setDiscount(float discount){
        this.discount = discount;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString(){
        return billCode + "     " + customerName + "     " + createDate +"     " + discount + "     " + totalPrice;
    }

    public void add(Bill bill) {
    }

    public String getCreatedDate() {
        return createDate;
    }

    public void setCreatedDate(String created_date) {
        this.createDate = created_date;
    }
}
