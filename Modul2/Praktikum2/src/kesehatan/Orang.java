/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 *
 * @author zein
 */
public class Orang {
    private int id;
    protected String nama;

    public Orang(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void talk() {
        System.out.println("Hai!");
    }
}
