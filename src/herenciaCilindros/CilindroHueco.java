package herenciaCilindros;

	public class CilindroHueco extends Circle {

	    private double radius;
	    private double height;
	    private double internalRadius;
	    private double internalHeight;

	    public CilindroHueco() {
	        radius = 1.0;
	        height = 1.0;
	        internalRadius = 0.5;
	        internalHeight = 0.5;
	    }

	    public CilindroHueco(double radius) {
	        this.radius = radius;
	        internalRadius = 0.5;
	        internalHeight = 0.5;
	    }
	    
	    public CilindroHueco(double radius, double height) {
	        this.radius = radius;
	        this.height = height;
	        internalRadius = 0.5;
	        internalHeight = 0.5;
	    }
	    
	    public CilindroHueco(double radius, double height, double internalRadius, double internalHeight) {
	        this.radius = radius;
	        this.height = height;
	        this.internalRadius = internalRadius;
	        this.internalHeight = internalHeight;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }
	    
	    public double getVolume() {
	        double volume = Math.PI * (Math.pow(radius, 2) - Math.pow(internalRadius, 2)) * height;
	        return volume;
	    }

	    public double getSurfaceArea() {
	        double surfaceArea = 2 * Math.PI * radius * (height + internalHeight) + 2 * Math.PI * (Math.pow(radius, 2) - Math.pow(internalRadius, 2));
	        return surfaceArea;
	    }

	    @Override
	    public String toString() {
	        return String.format("Cylinder[radio=%.2f, altura=%.2f, radioInterno=%.2f, alturaInterna=%.2f]",
	            radius, height, internalRadius, internalHeight);
	    }
	}

