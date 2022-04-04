package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice() {
    }

    public void printInvoice(){}

    public void buatInvoice(Produk produk, int jumlah, Member member){}

    public long getTagihan() {
        return tagihan;
    }

}