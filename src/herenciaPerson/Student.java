package herenciaPerson;

public class Student extends Person {

    private String school;
    private int grade;

    public Student() {
        super();
        school = "Unknown";
        grade = 0;
    }

    public Student(String name, int age, String gender, String school, int grade) {
        super(name, age, gender);
        this.school = school;
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student[Person[name=%s, age=%s, gender=%s], school=%s, grade=%s]", super.getName(), super.getAge(), super.getGender(), school, grade);
    }
}