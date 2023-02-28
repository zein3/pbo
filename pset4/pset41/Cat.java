package pset41;

/**
 * Kucing, dapat mengeong.
 * @author Ahmad Zein Haddad
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
