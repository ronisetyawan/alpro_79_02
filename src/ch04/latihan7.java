package ch04;

public class latihan7 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan data array = ");
        for(int x = 0; x<a.length; x++){
            System.out.print(a[x] + " ");
        }
        System.out.println("");
        System.out.print("jumlah angka dalam array = " + a.length);
        System.out.println("");
        int b = 0;
        for(int c : a){
            b = b+c;
        }
        System.out.print("Total penjumlahan semua angka yang ada di array = " + b);
        }
        
    }
