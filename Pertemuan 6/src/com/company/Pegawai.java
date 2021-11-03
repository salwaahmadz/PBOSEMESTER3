package com.company;

public class Pegawai extends Orang{
    private String nip;
    private String jabatan;

    public void setNip(String nip){
        this.nip = nip;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public String getNip(){
        return this.nip;
    }
    public String getJabatan(){
        return this.jabatan;
    }

    public void viewData(){
        System.out.println("NIP = " +this.nip);
        System.out.println("Nama = " +this.nama);
        System.out.println("Umur = "+this.umur);
    }

    public static void main(String[] args){
        Pegawai andi = new Pegawai();
        andi.setNip("001");
        andi.setNama("Andi");
        andi.setUmur(20);

        //Custom View di main
        System.out.println("1. NIP : " + andi.getNip());
        System.out.println("2. Nama : " + andi.getNama());
        System.out.println("3. Umur ; " +andi.getUmur());
        //View Data default dari class
        andi.viewData();
    }
}
