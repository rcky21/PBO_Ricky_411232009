package tugaspertemuanke3;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        int bilangan1,bilangan2;
        System.out.println("BERIKUT ADALAH UNTUK MENENTUKAN BILANGAN LEBIH BESAR ATAU KECIL");
        System.out.print("Masukkan Bilangan Ke 1 = ");
        bilangan1=in.nextInt();
        System.out.print("Masukkan Bilangan Ke 2 = ");
        bilangan2=in.nextInt();
        
        if (bilangan1 > bilangan2){
            System.out.println(+bilangan1+ " Lebih besar dari " +bilangan2);
        }else{
            System.out.println(+bilangan1+ " Lebih kecil dari " +bilangan2);
        }          
    }
}
