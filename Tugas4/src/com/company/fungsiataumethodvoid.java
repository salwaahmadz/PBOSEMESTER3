package com.company;

public class fungsiataumethodvoid {
    public static void main(String[] args)
    {
        //void itu artinya hampa
        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");
    }

    private static void selamatPagi(String nama)
    {
        System.out.println("Selamat Pagi "+nama);
    }

    //fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input)
    {
        System.out.println(input);
    }

    //fungsi atau method dengan kembalian
    //sehingga menggunakan return untuk
    //mengembalikan nilainya (10.f)

    private static float simpel()
    {
        return 10.f;
    }
}
