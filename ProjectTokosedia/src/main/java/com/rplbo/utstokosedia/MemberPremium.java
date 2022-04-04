package com.rplbo.utstokosedia;

public class MemberPremium extends Member{
    public final long POTONGAN = 10;
    private final String kodeVoucher = "TOKOSEDIA25" ;

    public MemberPremium(String alamat, String nama) {
        super(alamat);
        super(nama);
    }

    public void bayar (long jumlah, String kodeVoucher){
        if (jumlah < 0){
            System.out.println("Jumlah yang anda masukkan tidak valid!");
        }
        else if ((jumlah > 0) && !kodeVoucher.equals(this.kodeVoucher)){
            System.out.println("Pembayaran gagal! Kode tidak valid atau voucher sudah kadaluwarsa!");
        }
        else if (jumlah > 0 && kodeVoucher.equals(this.kodeVoucher)){
            System.out.println("Pembayaran Sukses!");
        }
    }

}