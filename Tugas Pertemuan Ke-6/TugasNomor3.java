import java.util.*;

public class TugasNomor3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahmahasiswa;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahmahasiswa = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlahmahasiswa];
        double[] tugas = new double[jumlahmahasiswa];
        double[] uts = new double[jumlahmahasiswa];
        double[] uas = new double[jumlahmahasiswa];
        double[] akhir = new double[jumlahmahasiswa];
        char[] grade = new char[jumlahmahasiswa];

        for (int i = 0; i < jumlahmahasiswa; i++) {

            System.out.println("\nMahasiswa Ke-" + (i + 1));

            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai Tugas    : ");
            tugas[i] = input.nextDouble();
            input.nextLine();

            System.out.print("Nilai UTS      : ");
            uts[i] = input.nextDouble();
            input.nextLine();

            System.out.print("Nilai UAS      : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            akhir[i] = (tugas[i] * 0.30) + (uts[i] * 0.30) + (uas[i] * 0.40);

            if (akhir[i] >= 80) {
                grade[i] = 'A';
            } else if (akhir[i] >= 70) {
                grade[i] = 'B';
            } else if (akhir[i] >= 59) {
                grade[i] = 'C';
            } else if (akhir[i] >= 50) {
                grade[i] = 'D';
            } else {
                grade[i] = 'E';
            }
        }

        System.out.println("\n\t\t\tDAFTAR NILAI MAHASISWA");
        System.out.println("----------------------------------------------------------------");

        System.out.println("No\tNama\t\tTugas\tUTS\tUAS\tAkhir\tGrade");

        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < jumlahmahasiswa; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    nama[i] + "\t\t" +
                    tugas[i] + "\t" +
                    uts[i] + "\t" +
                    uas[i] + "\t" +
                    akhir[i] + "\t" +
                    grade[i]
            );
        }

        System.out.println("---------------------------------------------------------------");
    }
    }
