/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke11.Nilai;

/**
 *
 * @author liuri
 */
public class hitungNilai {
    private double tugasMandiri;
    private double kuis;
    private double ujian;

    // Constructor untuk menerima input nilai 
    public hitungNilai(double tugasMandiri, double kuis, double ujian) {
        this.tugasMandiri = tugasMandiri;
        this.kuis = kuis;
        this.ujian = ujian;
    }

    // Nilai Murni Tugas Mandiri didapat dari 25% Nilai Tugas Mandiri 
    public double getMurniTugas() {
        return 0.25 * tugasMandiri;
    }

    // Nilai Murni Quis didapat dari 30% Nilai Quis 
    public double getMurniKuis() {
        return 0.30 * kuis;
    }

    // Nilai Murni Ujian didapat dari 45% Nilai Ujian 
    public double getMurniUjian() {
        return 0.45 * ujian;
    }

    // Method untuk menghitung total nilai akhir 
    public double getNilaiAkhir() {
        return getMurniTugas() + getMurniKuis() + getMurniUjian();
    }
}
