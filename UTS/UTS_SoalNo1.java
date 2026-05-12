import java.util.*;

public class TugasNomor3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    char looping;
  do{
    char jeniskelamin;
    double berat,tinggi,beratideal=0,hitungberat=0;
    String kategori="";
    
    System.out.print("Masukkan jenis kelamin anda (L / P)          : ");
    jeniskelamin=input.next().charAt(0);
    
    System.out.print("Masukkan tinggi badan anda (dalam satuan cm) : ");
    tinggi=input.nextDouble();
    if (jeniskelamin == 'L'){
      beratideal=(tinggi-100)-((tinggi-100)*0.1);
    }else if (jeniskelamin == 'P'){
      beratideal=(tinggi-100)-((tinggi-100)*0.15);
    }else{
      System.out.print("Jenis kelamin yang anda input salah !");
    }
    
    System.out.print("Berat badan ideal yang seharusnya adalah "+beratideal);
    
    System.out.print("\n\nMasukkan berat badan Anda (dalam satuan Kg)  : ");
    berat=input.nextDouble();
    if (jeniskelamin == 'L'){
      if (berat>beratideal){
        kategori="Gemuk";
        hitungberat=berat-beratideal;
        System.out.print("Anda termasuk dalam kategori "+kategori+" dan harus mengurangi berat badan anda sebanyak "+hitungberat+"Kg ("+berat+"Kg - "+beratideal+"Kg)");
        
      }else if (berat<beratideal){
        kategori="Kurus";
        hitungberat=beratideal-berat;
        System.out.print("Anda termasuk dalam kategori "+kategori+" dan harus menambah berat badan anda sebanyak "+hitungberat+"Kg ("+berat+"Kg - "+beratideal+"Kg)");
      }
    }else if (jeniskelamin == 'P'){
      if (berat>beratideal){
        kategori="Gemuk";;
        hitungberat=berat-beratideal;
        System.out.print("Anda termasuk dalam kategori "+kategori+" dan harus mengurangi berat badan anda sebanyak "+hitungberat+"Kg ("+berat+"Kg - "+beratideal+"Kg)");
        
      }else if (berat<beratideal){
        kategori="Kurus";
        hitungberat=beratideal-berat;
        System.out.print("Anda termasuk dalam kategori "+kategori+" dan harus menambah berat badan anda sebanyak "+hitungberat+"Kg ("+berat+"Kg - "+beratideal+"Kg)");
    }
    }
    
    System.out.print("\n\nApakah anda ingin menghitung ulang lagi? (y / n) : ");
    looping=input.next().charAt(0);
    System.out.print("\n\n\n");
  }while (looping=='y');
  System.out.println("Terimakasih telah memakai pemograman penghitung berat ideal !");
  }
  
}