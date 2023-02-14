/**
 * Kelas merepresentasikan pegawai dan mengandung nama serta gajinya.
 *
 * @author  Ahmad Zein Haddad
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

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

    /**
     * Mengembalikan nama lengkap pegawai.
     * @return nama lengkap.
     */
    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    /**
     * Mengembalikan gaji per bulan.
     * @return gaji per bulan.
     */
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Mengembalikan gaji per tahun.
     * @return salary in a year.
     */
    public int getAnnualSalary() {
        return (12 * salary);
    }

    /**
     * Menaikkan gaji dengan persentase (gaji * (1 + percent)).
     * @param percent
     * @return gaji baru.
     */
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
