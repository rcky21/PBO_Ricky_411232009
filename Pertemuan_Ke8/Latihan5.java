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

class Matematika {
    double satu, dua;

    public Matematika(double satu, double dua) {
        this.satu = satu;
        this.dua = dua;
    }

    public double tambah() { return satu + dua; }
    public double kurang() { return satu - dua; }
}

class HitungLengkap extends Matematika {
    public HitungLengkap(double satu, double dua) {
        super(satu, dua);
    }

    public double kali() { return satu * dua; }
    public double bagi() { return satu / dua; }
}

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Pertama: ");
        double val1 = input.nextDouble();
        System.out.print("Masukkan Nilai Kedua: ");
        double val2 = input.nextDouble();

        HitungLengkap hitung = new HitungLengkap(val1, val2);
        
        System.out.println("Penjumlahan: " + hitung.tambah());
        System.out.println("Pengurangan: " + hitung.kurang());
        System.out.println("Perkalian: " + hitung.kali());
        System.out.println("Pembagian: " + hitung.bagi());
        
        input.close();
    }
}
