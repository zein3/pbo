/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 * Kelas Main, mengandung fungsi main yang akan dijalankan program pertama kali.
 * @author Kelompok 2
 */
public class Main {
    public static void main(String[] args) {
        // Menginstansiasi objek rumah sakit dengan nama rs1 dan alamatnya sebagai penerapan hubungan composition
        RumahSakit rs1 = new RumahSakit(1, "RS Melati", new Alamat("Jl. Melati", "Tangerang"));

        // Mendftarkan objek Rafi dan Farhan ke daftar list pasien rumah sakit
        rs1.daftarkanPasien(new Pasien(1, "Rafi"));
        rs1.daftarkanPasien(new Pasien(2, "Farhan"));
        
        // Iterasi melalui setiap pasien dalam daftar pasien di rs1 (RS Melati)
        for (Pasien pasien : rs1.getDaftarPasien()) {
            System.out.println(pasien.getNama());
        }
        
        // Menginstansiasi objek pasien dengan nama p1 dan dokter dengan nama d1
        Pasien p1 = new Pasien(3, "Yoga"); 
        Dokter d1 = new Dokter(1, "Made");

        d1.talk(); //penerapan method overriding  dari objek dokter dari method talk di class orang
        p1.talk(); //penerapan method overriding  dari objek pasien dari method talk di class orang
    }
}
