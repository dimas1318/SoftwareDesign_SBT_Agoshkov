package dmitry_parshin_sbt;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        this(DEFAULT_LENGTH);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double countArea() {
        return Math.PI * radius * radius;
    }
}
