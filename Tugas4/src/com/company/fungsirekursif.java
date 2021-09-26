package com.company;
import java.util.*;
public class fungsirekursif {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukan nilai = "+nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = "+jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil Faktorial = "+faktorial);
    }
        //fungsi rekursif sederhana
        private static int hitungFaktorial(int parameter){
            System.out.println("Parameter = "+parameter);
            if (parameter == 1){
                return parameter;
            }
                return parameter * hitungFaktorial(parameter - 1);
        }

        private static int jumlahNilai(int parameter){
            System.out.println("Parameter = "+parameter);
            if (parameter==0){
                return parameter;
            }
                return parameter + jumlahNilai(parameter - 1);
        }

        private static void printNilai(int parameter){
            System.out.println("Nilai = "+parameter);
            if(parameter == 0){
                return;
            }
                parameter--;
                printNilai(parameter);
        }
}
