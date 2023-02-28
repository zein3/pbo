package pset41;

/**
 * Kelas abstrak untuk hewan.
 * @author Ahmad Zein Haddad
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
