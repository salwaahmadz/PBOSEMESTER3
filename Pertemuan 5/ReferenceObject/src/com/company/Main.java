package com.company;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul  = judul;
        this.judul  = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " +this.judul);
        System.out.println("\nPenulis\t: " +this.penulis);
    }
}

public class Main {

    public static void main(String[] args){
        Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        buku1.display();

        //Menampilkan Address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));

        //Assignment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        //Karena Buku1 dan Buku2 berada pada address atau referensi yang sama
        buku2.judul = "Membunuh Komandantur";
        buku1.display();
        buku2.display();

        //Kita akan memasukan object kedalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
	    String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi "+addressDataBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}
