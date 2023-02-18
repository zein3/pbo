/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 * penerapan inheritance, yang mana class pasien merupakan child dari class orang
 * @author Kelompok 2
 */
public class Staff extends Orang {
    /**
     * constructor untuk meminta id dan nama dari staff
     * @param id
     * @param nama 
     */
    public Staff(int id, String nama) {
        //memanggil constructor dari class parent yaitu class orang
        super(id, nama);
    }
}
