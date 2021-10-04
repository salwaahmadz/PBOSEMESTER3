package com.company;

//class tanpa constructor
class Polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //constructor dipanggil saat object pertama kali dibuat
    //Mahasiswa();
    //System.out.println("ini adalah constructor");
    //}

    //constructor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan){
        nama    = inputNama;
        NIM     = inputNim;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class constructor {
        public static void main(String[] args) throws Exception{
            Mahasiswa mahasiswa1 = new Mahasiswa("Salwa", "2020071047", "Informatika");
            Mahasiswa mahasiswa2 = new Mahasiswa("Zanjabila", "2021071047", "Informatika");

            //Polos objectPolos = new Polos();
            //objectPolos.dataString = "polos";
            //objectPolos.dataInteger = 0;

            //System.out.println(objectPolos.dataString);
            //System.out.println(objectPolos.dataInteger);
        }
}
