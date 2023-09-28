package herenciaCirculo;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5.0, "blue");

		System.out.println(circle.getRadius()); // 5.0
		System.out.println(circle.getColor()); // blue
		System.out.println(circle.getArea()); // 78.53981633974483

		circle.setRadius(10.0);
		circle.setColor("green");

		System.out.println(circle.toString()); // Circle[radius=10.0, color=green]
	
		Cilinder cilinder = new Cilinder(5.0,4.0, "Green");

		System.out.println(cilinder.getRadius()); // 
		System.out.println(cilinder.getHeight()); // 
		System.out.println(cilinder.getVolume()); // 

		cilinder.setHeight(8);
		cilinder.setColor("orange");

		System.out.println(cilinder.toString());
	}

}
