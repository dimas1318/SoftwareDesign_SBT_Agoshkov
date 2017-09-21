package dmitry_parshin_sbt;

import dmitry_parshin_sbt.Figure;

public class Square extends Figure {
    private double side;

    public Square() {
        this(DEFAULT_LENGTH);
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    double countArea() {
        return side * side;
    }
}
