import java.util.*;

public class TugasModulNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String merk, ukuran;
        int harga=0,hargatotal,jmlh;

        System.out.println("\nTOKO KELONTON KERONCONGAN");
        System.out.println("\nA. Susu Dancow");
        System.out.println("   1. Kecil    : Rp. 25.000");
        System.out.println("   2. Sedang   : Rp. 20.000");
        System.out.println("   3. Besar    : Rp. 15.000");
        System.out.println("\nB. Susu Bendera");
        System.out.println("   1. Kecil    : Rp. 20.000");
        System.out.println("   2. Sedang   : Rp. 17.500");
        System.out.println("   3. Besar    : Rp. 13.500");
        System.out.println("\nC. Susu SGM");
        System.out.println("   1. Kecil    : Rp. 22.000");
        System.out.println("   2. Sedang   : Rp. 18.500");
        System.out.println("   3. Besar    : Rp. 15.000");

        System.out.print("\nMasukkan merk Susu (Dancow, Bendera, SGM)    : ");
        merk=in.nextLine();
        System.out.print("\nMasukkan ukuran kaleng (Kecil, Sedang, Besar) : ");
        ukuran=in.nextLine();

        switch(merk){
            case "Dancow":
                switch(ukuran){
                    case "Kecil": harga=25000;
                    break;
                    case "Sedang": harga=20000;
                    break;
                    case "Besar": harga=15000;
                }
                break;
            case "Bendera":
                switch(ukuran){
                    case "Kecil": harga=20000;
                    break;
                    case "Sedang": harga=17500;
                    break;
                    case "Besar": harga=13500;
                    break;
                }
                break;
            case "SGM":
                switch(ukuran){
                    case "Kecil": harga=22000;
                    break;
                    case "Sedang": harga=18500;
                    break;
                    case "Besar": harga=15000;
                    break;
                }
                break;
            default:
            System.out.print("Pilihan tidak tersedia!");
            break;

        }
        System.out.print("\nHarga satuan barang : "+harga);

        System.out.print("\n\nMasukkan jumlah yang ingin dibeli : ");
        jmlh=in.nextInt();
        
        hargatotal=harga*jmlh;
        System.out.print("\nHarga yang harus dibayar sebesar Rp. "+hargatotal+"\n\n");

    }
}
