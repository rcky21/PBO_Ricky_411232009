/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke8;

/**
 *
 * @author liuri
 */
public class Latihan2 {
    double atas, bawah, tinggi;

    public Latihan2(double atas, double bawah, double tinggi) {
        this.atas = atas;
        this.bawah = bawah;
        this.tinggi = tinggi;
    }

    public double luasTrapesium() {
        return 0.5 * (atas + bawah) * tinggi;
    }

    public static void main(String[] args) {
        Latihan2 trapesium = new Latihan2(10, 14, 5);
        System.out.println("Luas Trapesium: " + trapesium.luasTrapesium());
    }
}
