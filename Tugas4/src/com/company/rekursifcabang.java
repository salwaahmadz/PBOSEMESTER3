package com.company;

import java.util.Scanner;

public class rekursifcabang {
    public static void main(String[] args)
    {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai N = ");
        int nilai = inputUser.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai Fibonacci ke-"+nilai+" adalah ");
    }

    private static int fibonacci(int n, String daun)
    {
        System.out.println("Daun "+daun);
        System.out.println("Fibonacci ke-"+n);
        if (n == 1 || n == 0)
        {
            return n;
        }else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}
