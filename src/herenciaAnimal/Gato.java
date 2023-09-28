package herenciaAnimal;

public class Gato extends Mamifero{
	 public Gato(String nombre) {
	        super(nombre);
	    }

	    @Override
	    public String toString() {
	        return "Gato: " + super.toString();
	    }
}