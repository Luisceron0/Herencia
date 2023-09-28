package herenciaFormas;

public class Rectangle extends Shape {

 double width;
 double height;

    public Rectangle() {
        super();
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
    public String toString() {
        return String.format("Rectangle[Shape[color=%s, filled=%s], width=%s, height=%s]", super.getColor(), super.isFilled(), width, height);
    }
}