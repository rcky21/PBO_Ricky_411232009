
package tugaspertemuanke3;

import java.util.*;

public class TugasModulNo3 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        String merk,ukuran;
        int jmlh,harga = 0,hargatotal;
        
        System.out.println("TOKO KELONTONG KERONCOONGAN");
        System.out.println("===========================");
        System.out.println("A. Susu Dancow");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        
        System.out.print("\nMasukkan Merk Susu   (Dancow ,Bendera, SGM)   = ");
        merk=in.nextLine();
        System.out.print("Masukkan Ukuran Kaleng (Kecil ,Sedang, Besar) = ");
        ukuran=in.nextLine();
        
        switch(merk){
            case "Dancow":
                switch(ukuran){
                    case "Kecil":
                        harga=25000;
                        break;
                    case "Sedang":
                        harga=20000;
                        break;
                    case "Besar":
                        harga=15000;
                        break;
                }
                break;
            case "Bendera":
                switch(ukuran){
                    case "Kecil":
                        harga=20000;
                        break;
                    case "Sedang":
                        harga=17500;
                        break;
                    case "Besar":
                        harga=13500;
                        break;
                }
                break;
            case "SGM":
                switch(ukuran){
                    case "Kecil":
                        harga=22000;
                        break;
                    case "Sedang":
                        harga=18500;
                        break;
                    case "Besar":
                        harga=15000;
                        break;
                }
                break;
                        
        }
         
        System.out.println("Harga Satuan Barang                           = Rp. "+harga);
        System.out.print("Jumlah Yang Dibeli                            = ");
        jmlh=in.nextInt();
        
        hargatotal=harga*jmlh;
        
        System.out.println("\nHarga Yang Harus dibayar Sebesar          = Rp. "+hargatotal);
        
    }
}
