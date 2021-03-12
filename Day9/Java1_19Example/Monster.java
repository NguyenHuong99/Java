package Java1_19Example;

abstract public class Monster {
    private String name;
    /** Constructs a Monster instance of the given name */
    public Monster(String name){
        this.name = name;
    }
    /** Define common behavior for all its subclasses */
    abstract public String attack();
}
