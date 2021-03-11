package Java1_18;

public class FireMonster extends Monster{
    /** Constructs a FireMonster with the give name */
    public FireMonster(String name){
        super(name);
    }
    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
