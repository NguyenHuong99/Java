package ss4;

public class TestSwitchEnumeration {
    enum Cards {
        Spade, Heart, Diamond, Club
    }
    public static void main(String[] args) {
        Cards cards = Cards.Diamond;
        switch (cards){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }
    }
}
