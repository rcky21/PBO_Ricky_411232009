import java.util.*;

public class TugasNomor4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jumlahkaryawan;
    double tunjanganjbtn=0, tunjanganpnddk=0, honortetap=700000;

    System.out.print("Masukkan Jumlah Karyawan : ");
    jumlahkaryawan=input.nextInt();
    input.nextLine();

    String[] nama = new String[jumlahkaryawan];
    int[] golongan = new int[jumlahkaryawan];
    int[] pendidikan = new int[jumlahkaryawan];
    int[] jamkerja = new int[jumlahkaryawan];
    double[] totalgaji = new double[jumlahkaryawan];
    int[] honorlembur = new int[jumlahkaryawan];
    int[] jamlembur = new int[jumlahkaryawan];
    String[] pendidikanoutput = new String[jumlahkaryawan];

    for (int i = 0; i < jumlahkaryawan; i++){
    System.out.print("\nKaryawan Ke- "+(i+1));

    System.out.print("\nNama Karyawan                        : ");
    nama[i] = input.nextLine();

    System.out.print("Golongan (1 / 2 / 3)                 : ");
    golongan[i] = input.nextInt();
    input.nextLine();

    System.out.print("Pendidikan (1 = SMU, 2 = D3, 3 = S1) : ");
    pendidikan[i] = input.nextInt();
    input.nextLine();

    System.out.print("Jumlah Jam Kerja                     : ");
    jamkerja[i] = input.nextInt();
    input.nextLine();

    if (golongan[i] == 1){
        tunjanganjbtn = 0.05*honortetap;
    }else if (golongan[i] == 2) {
        tunjanganjbtn = 0.1*honortetap;
    }else if (golongan[i] == 3) {
        tunjanganjbtn = 0.15*honortetap;
    }

    if (pendidikan[i] == 1){
        tunjanganpnddk = 0.025*honortetap;
        pendidikanoutput[i] = "SMU";
    }else if (pendidikan[i] == 2) {
        tunjanganpnddk = 0.05*honortetap;
        pendidikanoutput[i] = "D3";
    }else if (pendidikan[i] == 3) {
        tunjanganpnddk = 0.075*honortetap;
        pendidikanoutput[i] = "S1";
    }

    if (jamkerja[i] > 240){
        jamlembur[i] = jamkerja[i]-240;
        honorlembur[i] = jamlembur[i]*2500;
    }


    totalgaji[i] = honortetap+tunjanganjbtn+tunjanganpnddk+honorlembur[i];
    }

    System.out.println("\n\t\t\t\t PT. EASY");
    System.out.println("===========================================================================");
    System.out.println("No\tNama\tJabatan\t\tPendidikan\tHonor Lembur\tGaji Bersih");
    System.out.println("===========================================================================");

    for (int i = 0; i < jumlahkaryawan; i++) {

        System.out.println(
                (i + 1) + "\t" +
                nama[i] + "\t" +
                golongan[i] + "\t\t" +
                pendidikanoutput[i] + "\t\t" +
                honorlembur[i] + "\t\t" +
                totalgaji[i]

            );
        }
}
}
