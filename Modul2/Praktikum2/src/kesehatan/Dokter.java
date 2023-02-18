/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesehatan;

/**
 *
 * @author zein
 */
public class Dokter extends Orang {
    public Dokter(int id, String nama) {
        super(id, nama);
    }

    public void talk() {
        System.out.println("Silahkan pergi ke apotek");
    }
}
