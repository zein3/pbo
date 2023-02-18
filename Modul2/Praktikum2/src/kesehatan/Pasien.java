/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 *
 * @author zein
 */
public class Pasien extends Orang {
    private String noRegistrasi;

    // method overloading
    public Pasien(int id, String nama) {
        super(id, nama);
    }
    
    public Pasien(int id, String nama, String noRegistrasi) {
        super(id, nama);
        this.noRegistrasi = noRegistrasi;
    }

    /**
     * @return the noRegistrasi
     */
    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    /**
     * @param noRegistrasi the noRegistrasi to set
     */
    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    public void talk() {
        System.out.println("Terima kasih");
    }
}
