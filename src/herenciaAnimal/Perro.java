package herenciaAnimal;

public class Perro extends Mamifero {
	public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Perro: " + super.toString();
    }

}