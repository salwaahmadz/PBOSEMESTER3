package com.company;

abstract class Hewan {
    //Abstract Method (Tidak memiliki body)
    public abstract void suara();

    //Regular Method
    public void tidur(){
        System.out.println("ZZzzzz.....");
    }
}

class Ayam2 extends Hewan{
    public void suara(){
        System.out.println("Suara ayam : kukuruyuk");
    }
}

class Abstrak1 {
    public static void main(String[] args){
        //membuat objek ayam
        Ayam2 ayam = new Ayam2();
        ayam.suara();
        ayam.tidur();
    }
}
