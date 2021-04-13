package HomeWork5;

import java.io.Serializable;

public class Person implements Serializable {
    private String path, name, address;
    private double money;

    public Person(){
    }
    public Person(String path, String name, String address, double money){
        this.path = path;
        this.name = name;
        this.address = address;
        this.money = money;
    }
    public String getPath(){
        return path;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return name.equals(person.getName())
                && address.equals(person.getAddress())
                && money == person.getMoney();
    }
    @Override
    public String toString(){
        return name + "         " + address + "         " + money;
    }
}
