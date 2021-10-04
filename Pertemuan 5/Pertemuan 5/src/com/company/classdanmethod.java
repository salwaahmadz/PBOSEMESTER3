package com.company;

class Mahasiswa{
        String nama;
        String nim;
        String jurusan;
        double IPK;
        int umur;
}

public class classdanmethod {
        public static void main(String[] args) throws Exception{

            //Instansiasi  / Membuat Object
            Mahasiswa mahasiswa1 = new Mahasiswa();
            mahasiswa1.nama     = "Salwa Ahmad Z";
            mahasiswa1.nim      = "2020071047";
            mahasiswa1.jurusan  = "Informatika";
            mahasiswa1.IPK      = 3.3;
            mahasiswa1.umur    = 19;

            System.out.println(mahasiswa1.nama);
            System.out.println(mahasiswa1.nim);
            System.out.println(mahasiswa1.jurusan);
            System.out.println(mahasiswa1.IPK);
            System.out.println(mahasiswa1.umur);

            Mahasiswa mahasiswa2 = new Mahasiswa();
            mahasiswa2.nama     = "Salwa Zanjabila";
            mahasiswa2.nim      = "2021071047";
            mahasiswa2.jurusan  = "Informatika";
            mahasiswa2.IPK      = 3.5;
            mahasiswa2.umur    = 20;

            System.out.println(mahasiswa2.nama);
            System.out.println(mahasiswa2.nim);
            System.out.println(mahasiswa2.jurusan);
            System.out.println(mahasiswa2.IPK);
            System.out.println(mahasiswa2.umur);
        }
}
