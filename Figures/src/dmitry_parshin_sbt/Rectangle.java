package dmitry_parshin_sbt;

import dmitry_parshin_sbt.Figure;

import javax.xml.bind.annotation.XmlType;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle() {
        this(DEFAULT_LENGTH * 2, DEFAULT_LENGTH);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double countArea() {
        return length * width;
    }
}
