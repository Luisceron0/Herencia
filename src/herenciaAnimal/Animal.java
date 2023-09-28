package herenciaAnimal;

public class Animal {
	private String nombre;
	
	public Animal(String name) {
		this.nombre=name;
	}

	@Override
	public String toString() {
		return  nombre;		
	}
	
	
}