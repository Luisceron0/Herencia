package herenciaFormas;
public class Square extends Rectangle {

    public Square() {
        super();
        width = 1.0;
        height = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return String.format("Square[Shape[color=%s, filled=%s], width=%s, height=%s]", super.getColor(), super.isFilled(), width, height);
    }
}