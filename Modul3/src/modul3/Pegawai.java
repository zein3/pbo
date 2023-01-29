/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.util.Date;

/**
 *
 * @author zein
 */
public class Pegawai extends Orang {
    private String NIP;
    private String namaKantor;
    private String unitKerja;

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
}
