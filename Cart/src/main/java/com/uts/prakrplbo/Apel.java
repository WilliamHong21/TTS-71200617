package com.uts.prakrplbo;

public class Apel extends Buah{
    private int harga;


    public void setNama(String nama) {
        super.setNama("Apel");
    }


    public void setHarga() {
        this.setHarga(3000);
    }


    public String getNama() {
        return super.getNama();
    }


    public int getHarga() {
        return harga;
    }
}