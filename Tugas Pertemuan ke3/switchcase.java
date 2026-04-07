package tugaspertemuanke3;

import java.util.*;

public class switchcase {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        char pilih;
        String prodi=null;
        System.out.print("Masukkan Huruf dari A - C = ");
        pilih = input.next().charAt(0);
        switch(pilih){
            case 'A':
                prodi="Tehnik Informatika";
                break;
            case 'B':
                prodi="Sistem Informasi";
                break;
            case 'C':
                prodi="Tehnik Komputer";
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan salah");
                break;
        }
        System.out.println("Program Studi yang Anda pilih adalah "+prodi);
    }
}
