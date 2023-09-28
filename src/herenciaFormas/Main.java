package herenciaFormas;


 public class Main {

	    public static void main(String[] args) {
	        Circle circle = new Circle(5.0, "blue", true);
	        Rectangle rectangle = new Rectangle(10.0, 20.0, "red", false);
	        Square square = new Square(15.0, "green", true);

	        System.out.println(circle);
	        System.out.println(rectangle);
	        System.out.println(square);
	    }
	}
