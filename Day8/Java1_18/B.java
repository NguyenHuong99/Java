package Java1_18;

public class B extends A{
    public B(){
        super();
        System.out.println("Constructed an instance of B");
    }
    @Override
    public String toString(){
        return "This is B";
    }
}
