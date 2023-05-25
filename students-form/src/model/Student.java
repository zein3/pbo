/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zein
 */
public class Student {
    private String nim;
    private String firstName;
    private String lastName;
    private int age;
    private Asal asal;

    public Student() {}

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) throws Exception {
        if (nim.isEmpty())
            throw new Exception("NIM tidak boleh kosong!");
        if (nim.length() != 6)
            throw new Exception("Panjang NIM harus 6 karakter!");
        this.nim = nim;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) throws Exception {
        if (firstName.isEmpty()) {
            throw new Exception("Nama depan tidak boleh kosong!");
        }
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) throws Exception {
        if (lastName.isEmpty()) {
            throw new Exception("Nama belakang tidak boleh kosong!");
        }
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String age) throws Exception {
        if (age.isEmpty())
            throw new Exception("Umur tidak boleh kosong!");
        try {
            this.age = Integer.parseInt(age);
        } catch(Exception ex) {
            throw new Exception("Umur harus berbentuk angka!", ex);
        }
    }

    /**
     * @return the asal
     */
    public Asal getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(Asal asal) {
        this.asal = asal;
    }
}
