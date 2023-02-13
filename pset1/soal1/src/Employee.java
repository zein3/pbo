public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public static void main(String[] args) {
        Employee a = new Employee(12, "Budi", "Santoso", 12000);
        a.raiseSalary(5);
        a.setSalary(1000);
        System.out.println(a);
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return (12 * salary);
    }

    public int raiseSalary(int percent) {
        this.salary = (int) Math.round(this.salary * (1.0f + (percent / 100.0f)));
        return this.salary;
    }

    public String toString() {
        return String.format("Employee[id=%d,name=%s %s,salary=%d]",
            this.id,
            this.firstName,
            this.lastName,
            this.salary
        );
    }
}
