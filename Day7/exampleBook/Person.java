package exampleBook;

public class Person {
    // private instance variables
    private String name, address;

    /** Constructors a Person instance with the given name and address */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
     //Getter and Setters
    /** Returns the name */
    public String getName(){
        return name;
    }
    /** Returns the address */
    public  String getAddress(){
        return address;
    }
    /** Set the address */
    public void setAddress(String address){
        this.address = address;
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString(){
        return name + "(" + address + ")";
    }
}
