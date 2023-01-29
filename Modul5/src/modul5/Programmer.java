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

    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    public String getPlatform() {
        return platform;
    }

    public Programmer(String nama, Date tanggalLahir) {
        super(nama, tanggalLahir);
    }

}
