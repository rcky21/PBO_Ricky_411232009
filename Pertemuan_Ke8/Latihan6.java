/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke8;

/**
 *
 * @author liuri
 */
class Ujian {
    double nilai;

    public Ujian(double nilai) {
        this.nilai = nilai;
    }

    public double getNilaiMurni() {
        return nilai;
    }
}

class UTS extends Ujian {
    public UTS(double nilai) {
        super(nilai);
    }

    public double getNilaiMurni() {
        return super.getNilaiMurni() * 0.40;
    }
}

class UAS extends Ujian {
    public UAS(double nilai) {
        super(nilai);
    }

    public double getNilaiMurni() {
        return super.getNilaiMurni() * 0.60;
    }
}

public class Latihan6 {
    public String tentukanGrade(double nilaiAkhir) {
        if(nilaiAkhir >= 80) return "A";
        else if(nilaiAkhir >= 68) return "B";
        else if(nilaiAkhir >= 56) return "C";
        else if(nilaiAkhir >= 49) return "D";
        else return "E";
    }

    public static void main(String[] args) {
        UTS nilaiUts = new UTS(85);
        UAS nilaiUas = new UAS(70);

        double totalAkhir = nilaiUts.getNilaiMurni() + nilaiUas.getNilaiMurni();
        
        Latihan6 hasil = new Latihan6();
        
        System.out.println("Nilai Murni UTS (40%): " + nilaiUts.getNilaiMurni());
        System.out.println("Nilai Murni UAS (60%): " + nilaiUas.getNilaiMurni());
        System.out.println("Total Nilai Akhir: " + totalAkhir);
        System.out.println("Grade Anda: " + hasil.tentukanGrade(totalAkhir));
    }
}
