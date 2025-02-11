package Java1_19Example;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        // Test Polymorphism
        Movable p2 = new MovablePoint(3,4); // upcast
        p2.moveUp();
        System.out.println(p2);

        MovablePoint p3 = (MovablePoint) p2; // downcast
        System.out.println(p3);
    }
}
