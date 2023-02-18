/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 *
 * @author zein
 */
public class Main {
    public static void main(String[] args) {
        RumahSakit rs1 = new RumahSakit(1, "RS Melati");

        rs1.daftarkanPasien(new Pasien(1, "Rafi"));
        rs1.daftarkanPasien(new Pasien(2, "Farhan"));

        Pasien p1 = new Pasien(3, "Yoga");
        Dokter d1 = new Dokter(1, "Made");

        d1.talk();
        p1.talk();

        for (Pasien pasien : rs1.getDaftarPasien()) {
            System.out.println(pasien.getNama());
        }
    }
}
