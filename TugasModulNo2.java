package tugaspertemuanke3;

import java.util.*;

public class TugasModulNo2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        String nama;
        char grade;
        int nk,nt,nu;
        double nkt,ntt,nut,na;
        
        System.out.print("Nama Siswa          : ");
        nama=in.nextLine();
        System.out.print("Nilai Keaktifan     : ");
        nk=in.nextInt();
        System.out.print("Nilai Tugas         : ");
        nt=in.nextInt();
        System.out.print("Nilai Ujian         : ");
        nu=in.nextInt();
        
        nkt=nk*0.2;
        ntt=nt*0.3;
        nut=nu*0.5;
        
        na=nkt+ntt+nut;
        
        if (na >=80 && na<=100){
            grade='A';
        }else if(na>=70 && na<=79){
            grade='B';
        }else if (na>=59 && na<=69){
            grade='C';
        }else if (na>=50 && na<=58){
            grade='D';
        }else{
            grade='E';
        }
        
        System.out.println("\n\nSiswa Bernama "+nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan.");
        System.out.println("Nilai Keaktifan * 20%    :  "+nkt);
        System.out.println("Nilai Tugas     * 30%    :  "+ntt);
        System.out.println("Nilai Ujian     * 50%    :  "+nut);
        
        System.out.println("Jadi Siswa yang bernama "+nama+" memperoleh nilai akhir sebesar "+na);
        System.out.println("Grade nilai yang didapat adalah "+grade);
        
        
        
    }
}
