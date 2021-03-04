package EXAMPLE.WorkHome;

public class SoccerPlayer {
   private String name, xLocation;
   private int number;

   public SoccerPlayer() {
       name = "Ronaldo";
       xLocation = "Striker";
       number = 10;
   }
   public SoccerPlayer(int a) {
       name = "Ronaldo";
       xLocation = "Striker";
       number = a;
   }
    public SoccerPlayer(String a1, String a2, int a) {
        name = a1;
        xLocation = a2;
        number = a;
    }
    public String getName(){return name;}
    public String run(){return xLocation;}
    public  int getNumber(){return number;}
}
