package herenciaPerson;

public class Staff extends Person {

    private String company;
    private String position;

    public Staff() {
        super();
        company = "Unknown";
        position = "Unknown";
    }

    public Staff(String name, int age, String gender, String company, String position) {
        super(name, age, gender);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Staff[Person[name=%s, age=%s, gender=%s], company=%s, position=%s]", super.getName(), super.getAge(), super.getGender(), company, position);
    }
}