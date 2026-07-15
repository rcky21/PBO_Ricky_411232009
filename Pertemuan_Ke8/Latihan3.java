/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke8;

/**
 *
 * @author liuri
 */
import java.util.Scanner;

public class Latihan3 {
    double uts, uas, tugas, absensi;

    public Latihan3(double uts, double uas, double tugas, double absensi) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
        this.absensi = absensi;
    }

    public double hitungNilaiAkhir() {
        return (uts + uas + tugas + absensi) / 4; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUas = input.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai Absensi: ");
        double nilaiAbsensi = input.nextDouble();

        Latihan3 nilai = new Latihan3(nilaiUts, nilaiUas, nilaiTugas, nilaiAbsensi);
        System.out.println("Nilai Akhir Anda: " + nilai.hitungNilaiAkhir());
        
        input.close();
    }
}
