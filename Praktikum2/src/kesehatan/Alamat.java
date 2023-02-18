/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 * Mendefinisikan class Alamat untuk menerapkan hubungan composition antara class rumah sakit dan class alamat ini
 * @author Kelompok 2
 */
public class Alamat {
    // Mengenkapsulasi atribut namaJalan dan namaKota pada class alamat
    private String namaJalan; 
    private String namaKota;
    
    /**
     * contructor dari class alamat untuk menerima inputan namaJalan dan namaKota
     * @param namaJalan
     * @param namaKota 
     */
    public Alamat(String namaJalan, String namaKota) {
        this.namaJalan = namaJalan;
        this.namaKota = namaKota;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
}
