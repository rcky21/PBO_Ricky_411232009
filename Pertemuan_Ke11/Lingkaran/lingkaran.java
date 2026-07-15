/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke11.Lingkaran;

/**
 *
 * @author liuri
 */
public class lingkaran {
    private double radius;

    // Constructor untuk menginisialisasi radius
    public lingkaran(double radius) {
        this.radius = radius;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
