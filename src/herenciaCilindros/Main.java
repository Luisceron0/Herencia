package herenciaCilindros;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);

		System.out.println(circle.getRadius());
		System.out.println(circle.getLongitud()); 
		System.out.println(circle.getArea()); 
		
		System.out.println(circle.toString());
		
		
	
		Cilinder cilinder = new Cilinder(5.0,4.0);

		System.out.println(cilinder.getHeight()); 
		System.out.println(cilinder.getVolume()); 

		System.out.println(cilinder.toString());
	
	
		CilindroHueco cilindroHueco = new CilindroHueco(6,5,3,12);
		System.out.println(cilindroHueco.getHeight()); 
		System.out.println(cilindroHueco.getVolume()); 
		System.out.println(cilindroHueco.toString());
		
	}

}
