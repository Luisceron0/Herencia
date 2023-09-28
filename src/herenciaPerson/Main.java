package herenciaPerson;

public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff("Jorge Gutierrez", 34,"M","PepsiCo","Repartidor");
        Student student = new Student("Martin Lozano", 12,"M","PepsiCo",7);

        System.out.println(staff);
        System.out.println(student);
    }
}
