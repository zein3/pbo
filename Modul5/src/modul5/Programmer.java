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
public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    private String platform;

    public Programmer(String nama, Date tanggalLahir, String NIP) {
        super(nama, tanggalLahir, NIP);
    }

    public void setBahasa(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBahasa() {
        return bahasaPemrograman;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String getPekerjaan() {
        return "Coding all along day";
    }

}
