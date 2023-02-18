/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author zein
 */
public class Mahasiswa3 {
    int nim;
    String nama;

    void tambahData(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void tampilkanInfo() {
        System.out.println(nim + " " + nama);
    }
}
