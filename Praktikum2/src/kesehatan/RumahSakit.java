/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;
import java.util.ArrayList;

/**
 * Mendefinikan kelas rumah sakit
 * @author Kelompok 2
 */
public class RumahSakit {
    //menggunakan access modifier private
    private int id;
    private String nama;
    // composition antara objek alamat dan objek rumah sakit
    private Alamat alamat;
    // aggreegation antara objek pasien dan objek rumah sakit
    private ArrayList<Pasien> daftarPasien;

    /**
     * constructor class RumahSakit untuk mendefinisikan objek RumahSakit
     * @parameter id
     * @parameter nama 
     */
    public RumahSakit(int id, String nama, Alamat alamat) { 
        this.daftarPasien = new ArrayList<Pasien>();
        this.alamat = alamat;
    }

    /**
     * method mendaftarkan pasien
     * @parameter pasien
     */
    public void daftarkanPasien(Pasien pasien) {
        //add merupakan methods yang telah tersedia di kelas array list (ADT)
        this.daftarPasien.add(pasien);
    }

    /**
     * methods untuk mendapatkan daftar pasien, yang artinya methods ini
     * berfungsi untuk mengakses DaftarPasien yang telah di enkapsulasi di class RumahSakit
     * @return daftar pasien rumah sakit
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return this.daftarPasien; 
    }
}
