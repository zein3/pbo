public class Main {
    public static void main(String[] args) {
        // Tes Employee
        Employee em = new Employee(12, "Budi", "Santoso", 12000);
        em.raiseSalary(5);
        em.setSalary(1000);
        System.out.println(em);

        // Tes Account
        Account a = new Account("a", "Mr. A");
        Account b = new Account("b", "Mr. B", 500);

        b.transferTo(a, 100);

        System.out.println(a);
        System.out.println(b);

        // Tes Time
        Time time = new Time(0, 0, 5);

        do {
            System.out.println(time);
            time.previousSecond();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        } while(true);
    }
}
