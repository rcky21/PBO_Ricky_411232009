/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Ke8;

/**
 *
 * @author liuri
 */
import java.util.Scanner;

class Lingkaran {
    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double luas() {
        return Math.PI * radius * radius;
    }
}

class Silinder extends Lingkaran {
    double tinggi;

    public Silinder(double radius, double tinggi) {
        super(radius);
        this.tinggi = tinggi;
    }

    public double volume() {
        return super.luas() * tinggi;
    }
}

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Radius: ");
        double r = input.nextDouble();
        System.out.print("Masukkan nilai Tinggi Silinder: ");
        double t = input.nextDouble();

        Silinder tabung = new Silinder(r, t);
        System.out.println("Volume Silinder: " + tabung.volume());
        
        input.close();
    }
}
