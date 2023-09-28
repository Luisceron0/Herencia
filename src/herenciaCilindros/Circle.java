package herenciaCilindros;

public class Circle {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

  

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLongitud() {
        return 2*Math.PI *radius;
    }

  

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radio=%s, longitud=%s , area=%s]", radius,getLongitud(),getArea());
    }
}