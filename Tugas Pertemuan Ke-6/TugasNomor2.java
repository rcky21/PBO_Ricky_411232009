import java.util.*;
public class TugasNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("   GEROBAK FRIED CHICKEN");
        System.out.println("=============================");
        System.out.println("Kode     Jenis      Harga");
        System.out.println(" D       Dada       Rp. 2,500");
        System.out.println(" P       Paha       Rp. 2,000");
        System.out.println(" S       Sayap      Rp. 1,500");
        
        int banyakjenis, j;
        System.out.print("Masukkan Jumlah Jenis yang ingin dibeli : ");
        banyakjenis=input.nextInt();
        input.nextLine();
        char[]jenispotong=new char[banyakjenis];
        int[]banyakpotong=new int[banyakjenis];
        int[]hargasatuan=new int[banyakjenis];
        String[]namajenis=new String[banyakjenis];
        
        for (j=0; j<banyakjenis; j++){
            System.out.println("Jenis Ke- " +(j+1));
            
            System.out.print("Jenis Potong (D,P,S) : ");
            jenispotong[j]=input.next().charAt(0);

            System.out.print("Masukkan Jumlah Potong : ");
            banyakpotong[j]=input.nextInt();
            input.nextLine();

            if (jenispotong[j] == 'D'){
                namajenis[j] = "Dada";
                hargasatuan[j] = 2500;
            }else if (jenispotong[j] == 'P') {
                namajenis[j] = "Paha";
                hargasatuan[j] = 2000;
            }else{
                namajenis[j] = "Sayap";
                hargasatuan[j] = 1500;
            }
            System.out.println();
        }
        

        System.out.println(" BILL PEMBAYARAN GEROBAK CHICKEN ");
        System.out.println("=================================");
        System.out.println(" No.  Jenis  Harga  Jumlah  Total");
        System.out.println("=================================");

        int jumlahbayar=0,subtotal;
        for (j = 0; j < banyakjenis; j++) {
            subtotal = hargasatuan[j] * banyakpotong[j];
            jumlahbayar += subtotal;
 
            System.out.println(
                (j + 1) + "    " +
                namajenis[j] + "   " +
                hargasatuan[j] + "   " +
                banyakpotong[j] + "   Rp " +
                subtotal
            );
        }

        double pajak,totalbayar;
        
        pajak=jumlahbayar*0.1;
        totalbayar=jumlahbayar+pajak;

        System.out.println("=================================");
        System.out.println("Jumlah Bayar : Rp. "+jumlahbayar);
        System.out.println("Pajak 10%    : Rp. "+pajak);
        System.out.println("Total Bayar  : Rp. "+totalbayar);
    }
}