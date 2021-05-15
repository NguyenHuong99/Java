package Aptech_NGUYENVIETHUONG_TH2008071_ADF2;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private int phone;

    public Contact(){

    }
    public Contact(String name, int phone){
        this.name = name;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    @Override
    public String toString(){
        return name + "        " + phone;
    }
}
