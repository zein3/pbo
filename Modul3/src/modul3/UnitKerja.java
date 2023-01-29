/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.util.List;

/**
 *
 * @author zein
 */
public class UnitKerja {
    private String nama;
    private List<Pegawai> daftarPegawai;

    public UnitKerja(String nama, List<Pegawai> pegawai) {
        this.nama = nama;
        this.daftarPegawai = pegawai;
    }

    public String getNama() {
        return nama;
    }

    public List<Pegawai> getDaftarPegawai() {
        return daftarPegawai;
    }

    public void addPegawai(Pegawai pegawai) {
        this.daftarPegawai.add(pegawai);
    }

    public String toString() {
        String ret = "IT\n";
        for (int i = 0; i < daftarPegawai.size(); i++) {
            ret += daftarPegawai.get(i).toString() + "\n\n";
        }
        return ret;
    }
}
