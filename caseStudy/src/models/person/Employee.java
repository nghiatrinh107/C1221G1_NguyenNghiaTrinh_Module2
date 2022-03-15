package models.person;

public class Employee extends Person {
    private String degree;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String fullName, String birthday, String gender, int identityCard, String email, String phone, String degree, String position, int salary) {
        super(id, fullName, birthday, gender, identityCard, email, phone);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "degree=" + degree +
                ", position=" + position +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
