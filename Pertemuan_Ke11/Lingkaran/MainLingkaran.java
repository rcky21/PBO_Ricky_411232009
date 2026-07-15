/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke11.Lingkaran;

/**
 *
 * @author liuri
 */
public class MainLingkaran {
    public static void main(String[] args) {
        // Nilai Radius diinput langsung dari main method 
        double radiusInput = 10.0; 

        // Membuat objek dari class Lingkaran yang diimpor [cite: 70]
        lingkaran bundar = new lingkaran(radiusInput);

        // Menampilkan hasil perhitungan [cite: 72]
        System.out.println("=== PROGRAM PERHITUNGAN LINGKARAN ===");
        System.out.println("Radius Lingkaran     : " + radiusInput);
        System.out.println("Luas Lingkaran       : " + bundar.hitungLuas());
        System.out.println("Keliling Lingkaran   : " + bundar.hitungKeliling());
    }
}
