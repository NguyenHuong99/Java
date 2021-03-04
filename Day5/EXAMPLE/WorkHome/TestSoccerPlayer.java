package EXAMPLE.WorkHome;

public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer c1 = new SoccerPlayer("Messi", "Striker", 11);
        System.out.println("The name is: " + c1.getName());
        System.out.println("The xLocation is: " + c1.run());
        System.out.println("The number is: " + c1.getNumber());
        System.out.println();

        SoccerPlayer c2 = new SoccerPlayer(10);
        System.out.println("The name is: " + c2.getName());
        System.out.println("The xLocation is: " + c2.run());
        System.out.println("The number is: " + c2.getNumber());
        System.out.println();

        SoccerPlayer c3 = new SoccerPlayer();
        System.out.println("The name is: " + c3.getName());
        System.out.println("The xLocation is: " + c3.run());
        System.out.println("The number is: " + c3.getNumber());
    }
}
