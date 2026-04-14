package tugaspertemuanke3;

import java.util.*;

public class TugasModulNo1 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        String nama;
        int nilai1 , nilai2 , nilai3, rata;
        
        System.out.println("BERIKUT ADALAH PEMOGRAMAN HITUNG NILAI RATA-RATA");
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama=in.nextLine();
        System.out.print("Masukkan Nilai yang Pertama : ");
        nilai1=in.nextInt();
        
        System.out.print("Masukkan Nilai yang Kedua   : ");
        nilai2=in.nextInt();
        
        System.out.print("Masukkan Nilai yang Ketiga  : ");
        nilai3=in.nextInt();
        
        rata=(nilai1+nilai2+nilai3)/3;
        
        if (rata>=85){
            System.out.println("Anda mendapatkan hadiah seperangkat Komputer P4");
        }else if (rata>=70 && rata <=84){
            System.out.println("Anda mendapatkan hadiah seperangkat uang dengan nominal Rp. 500,000");
        }else{
            System.out.println("Anda mendapatkan hadiah hiburan");
        }
        
        
        System.out.println("Siswa yang bernama " +nama+ " Mendapatkan Nilai Rata-rata : "+rata);
    }   
}
