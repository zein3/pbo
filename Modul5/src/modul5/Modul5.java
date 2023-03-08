/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

import java.util.Date;

/**
 *
 * @author zein
 */
public class Modul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai dosen = new Pegawai("Budi", new Date(1976, 4, 5), "123123");
        Programmer egi = new Programmer("Egi", new Date(2000, 1, 1), "121212");

        egi.setBahasa("PHP");
        System.out.println(egi.getBahasa());
    }
    
}
