/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Date;

/**
 *
 * @author zein
 */
public abstract class Orang {
    private String nama;
    private Date tanggalLahir;

    public Orang(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaPanggilan() {
        return (nama.length() > 3) ? nama.substring(0, 3) : nama;
    }
}
