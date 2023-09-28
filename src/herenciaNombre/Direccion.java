package herenciaNombre;

import java.util.Scanner;

class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion() {
        super();
        this.calle = "";
        this.ciudad = "";
        this.provincia = "";
        this.codigoPostal = "";
    }

    public void nueva_direccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calle: ");
        this.calle = scanner.nextLine();
        System.out.print("Ciudad: ");
        this.ciudad = scanner.nextLine();
        System.out.print("Provincia: ");
        this.provincia = scanner.nextLine();
        System.out.print("Código Postal: ");
        this.codigoPostal = scanner.nextLine();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
    }

    public void nuevo_nombre() {
        super.Leer_nombre();
    }
}