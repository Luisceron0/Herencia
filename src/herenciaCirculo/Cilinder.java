package herenciaCirculo;

public class Cilinder extends Circle {

    private double radius;
    private double height;
    private String color;

    public Cilinder() {
        radius = 1.0;
        color = "red";
        height = 1.0;
    }

    public Cilinder(double radius) {
        this.radius = radius;
        color = "blue";
    }
    public Cilinder(double radius,double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public Cilinder(double radius,double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
    @Override
    public String toString() {
        return String.format("Cilinder[radius=%s,height=%s color=%s]", radius,height, color);
    }

	
}