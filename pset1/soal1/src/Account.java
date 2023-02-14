/**
 * Kelas untuk merepresentasikan akun bank.
 *
 * @author  Ahmad Zein Haddad
 */
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this(id, name);
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    /**
     * Menambahkan uang ke akun.
     * @param amount jumlah uang untuk ditambah.
     * @return jumlah uang baru.
     */
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    /**
     * Mengambil uang dari akun.
     * @param amount jumlah uang untuk diambil.
     * @return jumlah uang baru.
     */
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    /**
     * Transfer uang ke akun lain.
     * @param another akun penerima.
     * @param amount jumlah uang untuk ditransfer.
     * @return jumlah uang baru akun ini.
     */
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%d]",
            this.id,
            this.name,
            this.balance
        );
    }
}
