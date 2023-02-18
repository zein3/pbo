/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 * Penerapan Inheritance,yang mana kelas Orang merupakan parent dari pasien, dokter, dan staff
 * @author Kelompok 2
 */
public class Orang {
    private int id;
    private String nama;

    /**
     * constructor untuk meminta id dan nama dari objek pasien, dokter, dan staff
     * @param id
     * @param nama 
     */
    public Orang(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**
     * penerapan polymorphysm yaitu method overriding
     */
    public void talk() { //
        //perintah talk 'Hai' di sini sebagai default spesifikasi method talk
        System.out.println("Hai!");
    }

    /**
     * menampilkan nama dari objek pasien, dokter, dan staff (child dari class orang)
     * yang dienkapsulasi di class orang ini
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * mengatur nama dari objek pasien, dokter, dan staff (child dari class orang)
     * yang dienkapsulasi di class orang ini
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
