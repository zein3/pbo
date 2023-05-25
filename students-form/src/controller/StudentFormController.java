/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Database;
import java.util.List;
import javax.swing.JOptionPane;
import model.Asal;
import model.Student;
import view.StudentForm;

/**
 *
 * @author zein
 */
public class StudentFormController implements Controller {
    private StudentForm view;
    private List<Student> students;
    private List<Asal> locations;

    public StudentFormController() {
        this.view = new StudentForm();
        this.students = Database.students;
        this.locations = Database.locations;

        view.getResetButton().addActionListener(e -> resetForm());
        view.getSaveButton().addActionListener(e -> submitForm());

        while (view.getAsalComboBox().getItemCount() > 0) {
            view.getAsalComboBox().removeItemAt(0);
        }

        for (Asal location : locations) {
            view.getAsalComboBox().addItem(location.getLokasi());
        }
    }

    @Override
    public void activate() {
        this.view.setVisible(true);
    }

    @Override
    public void deactivate() {
        this.view.setVisible(false);
    }

    private void resetForm() {
        view.getFirstNameTextField().setText("");
        view.getLastNameTextField().setText("");
        view.getNimTextField().setText("");
        view.getAgeTextField().setText("");
    }

    private void submitForm() {
        try {
            Student s = new Student();
            s.setNim(view.getNimTextField().getText());

            if (view.getFirstNameTextField().getText().length() +
                view.getLastNameTextField().getText().length() > 50) {
                throw new Exception("Panjang nama depan + nama belakang tidak boleh melebihi 50 digit");
            }

            s.setFirstName(view.getFirstNameTextField().getText());
            s.setLastName(view.getLastNameTextField().getText());
            s.setAge(view.getAgeTextField().getText());
            s.setAsal(new Asal(String.valueOf(view.getAsalComboBox().getSelectedItem())));

            students.add(s);
            showAllStudents();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showAllStudents() {
        String message = "Daftar NIM dan Nama Mahasiswa yang telah berhasil disimpan:\n";
        for (Student student : students) {
            message += String.format("%s-%s %s\n",
                    student.getNim(),
                    student.getFirstName(),
                    student.getLastName()
            );
        }
        JOptionPane.showMessageDialog(view, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
