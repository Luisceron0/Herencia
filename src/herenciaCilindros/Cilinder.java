package herenciaCilindros;

public class Cilinder extends Circle {

    private double radius;
    private double height;

    public Cilinder() {
        radius = 1.0;
        height = 1.0;
    }

    public Cilinder(double radius) {
        this.radius = radius;
    }
    public Cilinder(double radius,double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double getLongitud() {
        return 2*Math.PI *radius;
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
        return String.format("Cilinder[radio=%s,Longitud=%s Volumen=%s]", radius,getLongitud(), getVolume());
    }

	
}