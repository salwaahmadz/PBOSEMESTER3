package com.company;

import java.util.Scanner;

public class Main {

     static double Gaji1(double jamKerja, int lembur){
         double gajiPokok, tunjangan;
         double jamLembur, gajiLembur, totalGaji;
         if(lembur == 1) {
             gajiPokok = 1486500;
             tunjangan = 250000;
             jamLembur = jamKerja - 173;
             gajiLembur = jamLembur * 20000;
             totalGaji = (gajiPokok - (gajiPokok * 0.5 / 100)) + (tunjangan - (tunjangan * 0.5 / 100)) + gajiLembur;
             System.out.println("Gaji anda adalah " + totalGaji);
             return totalGaji;
         }else{
             gajiPokok = 1486500;
             tunjangan = 250000;
             totalGaji = (gajiPokok - (gajiPokok * 0.5 / 100)) + (tunjangan - (tunjangan * 0.5 / 100));
             System.out.println("Gaji anda adalah " + totalGaji);
             return totalGaji;
         }
     }

    static double Gaji2(double jamKerja, int lembur){
        double gajiPokok, tunjangan;
        double jamLembur, gajiLembur, totalGaji;
        if (lembur == 1){
            gajiPokok = 1926000;
            tunjangan = 300000;
            jamLembur = jamKerja - 173;
            gajiLembur = jamLembur * 20000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100)) + gajiLembur;
            System.out.println("Gaji anda adalah " +totalGaji);
            return totalGaji;
        }else{
            gajiPokok = 1926000;
            tunjangan = 300000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100));
            return totalGaji;
        }
    }

    static double Gaji3(double jamKerja, int lembur){
        double gajiPokok, tunjangan;
        double jamLembur, gajiLembur, totalGaji;
        if(lembur == 1){
            gajiPokok = 2456700;
            tunjangan = 350000;
            jamLembur = jamKerja - 173;
            gajiLembur = jamLembur * 20000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100)) + gajiLembur;
            System.out.println("Gaji anda adalah " +totalGaji);
            return totalGaji;
        }else{
            gajiPokok = 2456700;
            tunjangan = 350000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100));
            System.out.println("Gaji anda adalah " +totalGaji);
            return totalGaji;
        }
    }

    static double Gaji4(double jamKerja, int lembur){
        double gajiPokok, tunjangan;
        double jamLembur, gajiLembur, totalGaji;
        if(lembur == 1){
            gajiPokok = 2889500;
            tunjangan = 400000;
            jamLembur = jamKerja - 173;
            gajiLembur = jamLembur * 20000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100)) + gajiLembur;
            System.out.println("Gaji anda adalah " +totalGaji);
            return totalGaji;
        }else{
            gajiPokok = 2889500;
            tunjangan = 400000;
            totalGaji = (gajiPokok-(gajiPokok * 0.5 / 100)) + (tunjangan-(tunjangan * 0.5 / 100));
            System.out.println("Gaji anda adalah " +totalGaji);
            return totalGaji;
        }
    }


    public static void main(String[] args) {
         double jamKerja, golonganGaji;
         char opsi = 0;
         Scanner input = new Scanner(System.in);
         System.out.println("Golongan Gaji anda ? ");
         golonganGaji = input.nextDouble();
         if(golonganGaji == 1){
                 System.out.println("Apakah anda lembur bulan ini? ");
                 opsi = input.next().charAt(0);
                 if((opsi == 'Y')||(opsi == 'y')){
                     System.out.println("Total jam kerja anda bulan ini? ");
                     jamKerja = input.nextDouble();
                     Gaji1(jamKerja, 1);
                 }else{
                    Gaji1(0, 0);
                 }
         }else if(golonganGaji == 2){
            System.out.println("Apakah anda lembur bulan ini? ");
            opsi = input.next().charAt(0);
            if((opsi == 'Y')||(opsi == 'y')){
                System.out.println("Total jam kerja anda bulan ini? ");
                jamKerja = input.nextDouble();
                Gaji2(jamKerja, 1);
            }else{
                Gaji2(0, 0);
            }
        }else if(golonganGaji == 3){
            System.out.println("Apakah anda lembur bulan ini? ");
            opsi = input.next().charAt(0);
            if((opsi == 'Y')||(opsi == 'y')){
                System.out.println("Total jam kerja anda bulan ini? ");
                jamKerja = input.nextDouble();
                Gaji3(jamKerja, 1);
            }else{
                Gaji3(0, 0);
            }
        }else if(golonganGaji == 4){
            System.out.println("Apakah anda lembur bulan ini? ");
            opsi = input.next().charAt(0);
            if((opsi == 'Y')||(opsi == 'y')){
                System.out.println("Total jam kerja anda bulan ini? ");
                jamKerja = input.nextDouble();
                Gaji4(jamKerja, 1);
            }else{
                Gaji4(0, 0);
            }
        }else{
             System.out.println("Terjadi Error, pastikan golongan gaji yang anda masukan benar!");
         }
     }
}