/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students.form;

import controller.Controller;
import controller.StudentFormController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zein
 */
public class StudentsForm {

    private static List<Controller> controllers = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controllers.add(new StudentFormController());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                controllers.get(0).activate();
            }
        });
    }
    
}
