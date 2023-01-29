/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

import java.util.Date;

/**
 *
 * @author zein
 */
abstract class Orang {
    private String nama;
    private Date tanggalLahir;    

    public Orang(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tgl) {
        this.tanggalLahir = tgl;
    }

    public String getNama() {
        return this.nama;
    }

    public Date getTanggalLahir() {
        return this.tanggalLahir;
    }

    public String toString() {
        return this.nama +
                " lahir pada " + this.tanggalLahir;
    }

    public void printGaji() {
        System.out.println("tidak ada");
    }

    abstract public String getAlamat();
    abstract public void setAlamat(String alamat);
}
