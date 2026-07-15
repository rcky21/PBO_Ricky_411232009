/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke11.Nilai;

import Pertemuan_Ke11.Nilai.hitungNilai;
import java.util.Scanner;
public class MainPenilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM INPUT NILAI AKHIR ===");
        
        System.out.print("Masukkan Nilai Tugas Mandiri : ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis          : ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai Ujian         : ");
        double ujian = input.nextDouble();

        hitungNilai hn = new hitungNilai(tugas, kuis, ujian);

        System.out.println("\n=================================");
        System.out.println("Nilai Murni Tugas (25%) : " + hn.getMurniTugas()); // 
        System.out.println("Nilai Murni Kuis (30%)  : " + hn.getMurniKuis());  // 
        System.out.println("Nilai Murni Ujian (45%) : " + hn.getMurniUjian()); // 
        System.out.println("---------------------------------");
        System.out.println("TOTAL NILAI AKHIR       : " + hn.getNilaiAkhir()); // 
        System.out.println("=================================");

        input.close();
    }
}
