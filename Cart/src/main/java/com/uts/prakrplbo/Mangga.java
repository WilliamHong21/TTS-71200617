package com.uts.prakrplbo;

public class Mangga extends Buah{
    private int harga;


    public void setHarga() {
        this.setHarga(2000);
    }


    public void setNama(String nama) {
        super.setNama("Mangga");
    }


    public String getNama() {
        return super.getNama();
    }


    public int getHarga() {
        return harga;
    }
}