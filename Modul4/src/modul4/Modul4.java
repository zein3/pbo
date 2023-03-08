/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

import java.util.Date;

/**
 *
 * @author zein
 */
public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai lutfi = new Pegawai("Lutfi", new Date(1997, 8, 31), "7828", "STIS", "IT");
        lutfi.setAlamat("Otista 64 C");

        System.out.println(lutfi.getAlamat());

        lutfi.setNIDN("12345678");
        lutfi.setKelompokKeahlian("Computer Science");
        System.out.println("ada dosen lutfi dengan NIDN " + lutfi.getNIDN() + " kelompok " + lutfi.getKelompokKeahlian());
    }
    
}
