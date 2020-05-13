package ch02;

import java.util.Date;

public class objectproduk {
    public static void main(String[] args) {
        produk x1 = new produk();
        x1.barcode = "423332223";
        x1.nama = "pepsident";
        x1.tanggalkedarluarsa = new Date(2021-7-2);
        x1.harga = 8900;

        produk x2 = new produk();
        x2.barcode = "423332223";
        x2.nama = "pepsident";
        x2.tanggalkedarluarsa = new Date(2021-7-2);
        x2.harga = 8900;

        System.out.println(x1.nama + " (" + x1.barcode + ")");
        System.out.println("Harga: Rp" + x1.harga);
        System.out.println("Exp: " + x1.tanggalkedarluarsa.toString());

        System.out.println("===================");
        
        System.out.println(x2.nama + " (" + x2.barcode + ")");
        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " + x2.tanggalkedarluarsa.toString());

    }
}