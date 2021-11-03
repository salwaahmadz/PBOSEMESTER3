package com.company;

public class Pegawai extends Manusia {
    public String getGelarBelakang() {
        return gelarBelakang;
    }

    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }

    private String gelarBelakang;

    @Override
    public void dataSingkat() {
        this.namaLengkap();
        System.out.println("Umur: "+ this.getUmur() + " tahun");
    }

    @Override
    public void namaLengkap() {
        System.out.println("Nama Pegawai: " + this.getNamaDepan() +
                " " + this.getNamaBelakang() + ", " + this.getGelarBelakang());
    }

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.setNamaDepan("Ijat");
        pegawai.setNamaBelakang("Sumardi");
        pegawai.setUmur(24);
        pegawai.setGelarBelakang("S.Kom");
        pegawai.dataSingkat();
    }
}
