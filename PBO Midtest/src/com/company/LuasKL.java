package com.company;
import java.util.Scanner;

class Lingkaran{
    private double r;
    private double keliling;
    private double phi = 3.14;

    public void LuasLingkaran(double r)
    {
        this.r = r;
        double luas = 0.5 * phi * r * r;
        System.out.println("Luas Lingkaran adalah = " + luas);
    }

    public void KelilingLingkaran(double r)
    {
        this.r = r;
        this.keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran adalah = " + this.keliling);
    }

    public double DiameterLingkaran(){
        double diameter = this.keliling / this.phi;
        return diameter;
    }
}

public class LuasKL extends Lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Lingkaran Lingkaran = new Lingkaran();
        System.out.println("Program sederhana Lingkaran");
        System.out.print("Masukan panjang Jari-Jari = ");
        double jari = input.nextDouble();
        Lingkaran.LuasLingkaran(jari);
        Lingkaran.KelilingLingkaran(jari);
        System.out.println("Diameter lingkaran = "+Lingkaran.DiameterLingkaran());
    }
}
