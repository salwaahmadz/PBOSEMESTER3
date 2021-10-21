package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Pulsa {
    public static void main(String[] args){
        int jam,menit,detik, jumlahWaktu, tarif;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jam : ");
        jam = input.nextInt();
        System.out.println("Masukan Menit : ");
        menit = input.nextInt();
        System.out.println("Masukan Detik : ");
        detik = input.nextInt();

        jumlahWaktu = (jam * 3600) + (menit * 60) + detik;
        System.out.println("Konversi Detik: " +jumlahWaktu);

        tarif = (jumlahWaktu/5)*150;
        System.out.println("Tarif Anda : "+tarif);
    }
}
