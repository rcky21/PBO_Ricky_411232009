package tugaspertemuanke3;

import java.util.*;

public class TugasPertemuanKe3 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        
        int bilangan;
        System.out.println("Masukkan Sebuah Bilangan = ");
        bilangan=in.nextInt();
        if (bilangan %2 == 0){
            System.out.println(+bilangan+ " Merupakan bilangan GENAP");
        }else{
            System.out.println(+bilangan+ " Merupakan bilangan GANJIL");
        }
    }
    
}
