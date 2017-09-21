package dmitry_parshin_sbt;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle();

        System.out.println("Square's area is " + square.countArea());
        System.out.println("Circle's area is " + circle.countArea());
        System.out.println("Rectangle's area is " + rectangle.countArea());
    }
}
