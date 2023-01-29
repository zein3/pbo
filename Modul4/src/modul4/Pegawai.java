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
public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private String alamat;
    private String NIDN;
    private String keahlian;

    public Pegawai(String nama, Date tanggalLahir, String NIP, String namaKantor, String unitKerja) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNamaKantor() {
        return namaKantor;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public String toString() {
        return super.toString() +
                "\nNIP: " + this.NIP +
                "\nKantor: " + this.namaKantor +
                "\nUnit Kerja: " + this.unitKerja;
    }

    public void printGaji() {
        System.out.println("7 juta");
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
    public String getKelompokKeahlian() {
        return keahlian;
    }

    @Override
    public void setKelompokKeahlian(String kelompokKeahlian) {
        this.keahlian = kelompokKeahlian;
    }
}
