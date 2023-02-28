package pset41;

/**
 * Kelas Anjing, dapat menyapa anjing lain.
 * @author Ahmad Zein Haddad
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
