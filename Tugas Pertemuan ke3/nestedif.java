package tugaspertemuanke3;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        int bilangan;
        System.out.print("Masukkan Sebuah Bilangan (1 - 100) = ");
        bilangan=in.nextInt();
        if (bilangan<1 || bilangan>100){
            System.out.println(+bilangan+ " Merupakan Angka yang diluar dari 1 dan 100");
            }else{
                System.out.println("Angka yang anda input rentan dari 1 - 100");
            }
        if (bilangan %2 == 0){
            System.out.println(+bilangan+ " Merupakan bilangan GENAP");
            }else{
                System.out.println(+bilangan+ " Merupakan bilangan GANJIL");
        }
    }
}
