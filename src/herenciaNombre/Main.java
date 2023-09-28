package herenciaNombre;

public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion();

        System.out.println("Ingrese información de la dirección:");
        direccion.nuevo_nombre();
        direccion.nueva_direccion();

        System.out.println("\nInformación completa:");
        direccion.mostrar();
    }
}