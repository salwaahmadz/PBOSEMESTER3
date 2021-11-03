package com.company;

public class Orang {
    protected String nama;
    protected int umur;
    protected String jenisKelamin;

    public void setNama(String nm){
        this.nama = nm;
    }
    public void setUmur(int u){
        this.umur = u;
    }
    public void setJenisKelamin(String jk){
        this.jenisKelamin = jk;
    }

    public String getNama(){
        return this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
}
