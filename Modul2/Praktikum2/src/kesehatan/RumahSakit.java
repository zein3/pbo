/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;
import java.util.ArrayList;

/**
 *
 * @author zein
 */
public class RumahSakit {
    private int id;
    private String nama;
    private ArrayList<Pasien> daftarPasien;

    public RumahSakit(int id, String nama) {
        this.daftarPasien = new ArrayList<Pasien>();
    }

    public void daftarkanPasien(Pasien pasien) {
        this.daftarPasien.add(pasien);
    }

    public ArrayList<Pasien> getDaftarPasien() {
        return this.daftarPasien;
    }
}
