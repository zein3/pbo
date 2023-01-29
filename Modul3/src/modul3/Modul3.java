/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zein
 */
public class Modul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orang lutfi = new Orang("Lutfi", new Date(1997, 8, 31));
        Pegawai tuti = new Pegawai("Tuti", new Date(1997, 8, 2), "6836492379", "STIS", "IT");
        Pegawai egi = new Pegawai("Egi", new Date(1998, 7, 1), "6837621928", "STIS", "IT");

        UnitKerja it = new UnitKerja("IT", new ArrayList<Pegawai>());
        it.addPegawai(tuti);
        it.addPegawai(egi);

        System.out.println(it);

        Gedung STIS = new Gedung();
        STIS.addRuang("Lobi");
        STIS.addRuang("Bagian Umum");
        STIS.addRuang("Kepala Kantor");

        System.out.println(STIS);
    }
    
}
