/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 * penerapan inheritance, yang mana class pasien merupakan child dari class orang
 * @author Kelompok 2
 */
public class Pasien extends Orang {
    //menambahkan atribut no registrasi khusus untuk pasien
    private String noRegistrasi;

    /**
     * Method overloading, karena ada dua constructor pasien dengan parameter yang berbeda
     * @param id
     * @param nama 
     */
    public Pasien(int id, String nama) {
        //mengakses constructor dari class parent, dalam hal ini adalah class orang
        super(id, nama);
    }
    
    public Pasien(int id, String nama, String noRegistrasi) {
        //mengakses constructor dari class parent, dalam hal ini adalah class orang
        super(id, nama);
        this.noRegistrasi = noRegistrasi;
    }

    /**
     * Mengambil nomor registrasi dari objek yang di-instansiasi melalui class pasien
     * @return the noRegistrasi
     */
    public String getNoRegistrasi() {
        return noRegistrasi;
    } 

    /**
     * Mengatur nomor registrasi dari objek yang di-instansiasi melalui class pasien
     * @param noRegistrasi the noRegistrasi to set
     */
    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    /**
     * penerapan polymorphysm yaitu method overriding khusus yang akan digunakan oleh pasien
     */
    public void talk() {
        System.out.println("Terima kasih");
    }
}
