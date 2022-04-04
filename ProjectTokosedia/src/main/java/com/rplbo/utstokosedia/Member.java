package com.rplbo.utstokosedia;

public class Member {
    private String alamat, nama;
    private Dompet dompet;

    public Member(String alamat, String nama) {
        this.alamat = alamat;
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public void cekSaldo(){}

    public void bayar(long jumlah){
    }

    public void topUp(long jumlah){}
}