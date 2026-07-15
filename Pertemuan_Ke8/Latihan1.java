/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke8;

/**
 *
 * @author liuri
 */
public class Latihan1 {
    double r;

    public Latihan1(double radius) {
        this.r = radius;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Latihan1 lingkaran = new Latihan1(7.0);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}