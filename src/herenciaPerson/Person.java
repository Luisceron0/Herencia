package herenciaPerson;

public abstract class Person {

    protected String name;
    protected int age;
    protected String gender;

    public Person() {
        name = "Unknown";
        age = 0;
        gender = "Unknown";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s, age=%s, gender=%s]", name, age, gender);
    }
}