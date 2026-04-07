import java.util.*;

public class TugasModulNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama;
        char grade;
        int nk, nt, nu;
        double nktotal, nttotal, nutotal, nakhir;

        System.out.println("PROGRAM PERHITUNGAN NILAI AKHIR");
        System.out.println("Masukkan Nama Siswa : ");
        nama=in.nextLine();
        System.out.println("Nilai Keaktifan     : ");
        nk=in.nextInt();
        System.out.println("Nilai Tugas         : ");
        nt=in.nextInt();
        System.out.println("Nilai Ujian         : ");
        nu=in.nextInt();

        System.out.println("Siswa yang bernama "+nama);
        System.out.println("Dengan nilai presentasi yang dihasilkan");

        nktotal=nk*0.2;
        System.out.println("Nilai Keaktifan * 20%  : "+nktotal);

        nttotal=nt*0.3;
        System.out.println("Nilai Tugas     * 30%  : "+nttotal);

        nutotal=nu*0.5;
        System.out.println("Nilai Ujian     * 50%  : "+nutotal);

        nakhir=nktotal+nttotal+nutotal;

        if (nakhir >= 80 && nakhir <=100){
            grade='A';
        }else if (nakhir >=70 && nakhir <=79){
            grade='B';
        }else if (nakhir >=59 && nakhir <=69){
            grade='C';
        }else if (nakhir >=50 && nakhir <=58){
            grade='D';
        }else{
            grade='E';
        }
        
        System.out.println("Jadi siswa yang bernama "+nama+ "memperoleh nilai akhir sebesar "+nakhir+ "Grade nilai yang didapat adalah "+grade);

    }
}
