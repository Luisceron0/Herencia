package herenciaAnimal;

public class Mamifero extends Animal{

	public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Mamifero: Animal: Nombre: " + super.toString();
    }
}