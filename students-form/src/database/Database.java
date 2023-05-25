/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Asal;
import model.Student;

/**
 *
 * @author zein
 */
public class Database {
    public static List<Asal> locations = Arrays.asList(new Asal[] {
        new Asal("Jakarta"),
        new Asal("Bogor"),
        new Asal("Depok"),
        new Asal("Tangerang"),
        new Asal("Bekasi"),
    });
    public static List<Student> students = new ArrayList<>();
}
