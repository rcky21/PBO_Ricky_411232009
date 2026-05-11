import java.util.*;

public class TugasNomor1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahdata,angka,terbesar=0;

        System.out.print("Masukkan jumlah angka : ");
        jumlahdata = input.nextInt();

        for (int i = 1; i <= jumlahdata; i++) {

            System.out.print("Masukkan angka ke-" + i + " : ");
            angka = input.nextInt();

            if (i == 1) {
                terbesar = angka;
            }else if (angka > terbesar) {
                terbesar=angka;
            }
        }

        System.out.println("\nAngka terbesar adalah : "+terbesar);
    }
}

