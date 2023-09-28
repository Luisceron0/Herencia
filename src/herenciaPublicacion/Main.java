package herenciaPublicacion;

public class Main {

    public static void main(String[] args) {
        Disco disco = new Disco("Miranda! - Safari", 50000,65);
        Book book = new Book("100 años de soledad",496,1967,78000);

        System.out.println(disco);
        System.out.println(book);
    }
}

