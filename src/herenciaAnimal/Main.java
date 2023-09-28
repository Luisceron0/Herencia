package herenciaAnimal;

public class Main {
	public static void main(String[]args) {
		Animal animal = new Animal("Loro");
        Mamifero mamifero = new Mamifero("Murcielago");
        Gato gato = new Gato("Miau");
        Perro perro = new Perro("Wau");

        System.out.println(animal);
        System.out.println(mamifero);
        System.out.println(gato);
        System.out.println(perro);
	}
}