package herenciaNombre;
import java.util.Scanner;

class Nombre {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;

    public Nombre() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
    }

    public void Leer_nombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Primer Apellido: ");
        this.primerApellido = scanner.nextLine();
        System.out.print("Segundo Apellido: ");
        this.segundoApellido = scanner.nextLine();
    }

    public void mostrar() {
        System.out.println("Nombre Completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}