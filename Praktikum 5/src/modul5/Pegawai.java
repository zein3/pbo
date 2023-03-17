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
public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String NIDN;
    private String kantor;
    private String unitKerja;
    private String kelompokKeahlian;

    public Pegawai(String nama, Date tanggalLahir, String NIP) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public String getNIP() {
        return NIP;
    }

    public String getKantor() {
        return kantor;
    }

    @Override
    public String getNIDN() {
        return NIDN;
    }

    @Override
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    @Override
    public String getKeahlian() {
        return kelompokKeahlian;
    }

    @Override
    public void setKeahlian(String keahlian) {
        this.kelompokKeahlian = keahlian;
    }

    @Override
    public String getPekerjaan() {
        return "mengajar";
    }
}
