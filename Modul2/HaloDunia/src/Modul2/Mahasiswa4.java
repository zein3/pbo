/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author zein
 */
public class Mahasiswa4 {
    private int nim;
    private String nama;

    public Mahasiswa4(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void TampilkanInfo() {
        System.out.println(this.nim + " " + this.nama);
    }
}
