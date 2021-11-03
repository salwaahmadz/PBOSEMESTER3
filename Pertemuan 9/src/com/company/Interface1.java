package com.company;

interface  MaklukHidup{
    public void bernafas();
    public void bernama(String nama);
}

interface Mamalia{
    public void habitat();

}

class Paus implements Mamalia, MaklukHidup{
    @Override
    public void bernafas() {
        System.out.println("Bernafas dengan paru-paru");
    }

    @Override
    public void bernama(String nama) {
        System.out.println("Bernama : " +nama);
    }

    @Override
    public void habitat() {
        System.out.println("Habitat di Laut");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Paus paus = new Paus();
        paus.bernama("Paus");
        paus.bernafas();
        paus.habitat();
    }
}
