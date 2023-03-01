package pset44;

/**
 * Kelas turunan Circle yang mengimplementasi interface Resizable.
 * @author Ahmad Zein Haddad
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

    /**
     * Mengubah ukuran lingkaran menjadi x persen dari ukuran aslinya.
     * @param percent (int)
     */
    @Override
    public void resize(int percent) {
        this.radius *= (percent / 100.0f);
    }
}
