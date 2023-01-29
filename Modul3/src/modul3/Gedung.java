/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zein
 */
public class Gedung {
    private List<Ruang> daftarRuang = new ArrayList<Ruang>();

    public Gedung() {
        daftarRuang.add(new Ruang("Utama"));
    }

    public void addRuang(String nama) {
        daftarRuang.add(new Ruang(nama));
    }

    public List<Ruang> getDaftarRuang() {
        return daftarRuang;
    }

    public String toString() {
        String hasil = "";
        for (Ruang ruang : this.daftarRuang) {
            hasil += "Ruang: " + ruang.getNama() + "\n";
        }

        return hasil;
    }
}
