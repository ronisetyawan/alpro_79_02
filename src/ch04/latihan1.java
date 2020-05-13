package ch04;

import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        Scanner x = new Scanner(System.in);


        System.out.println("masukkan angka yang anda cari");
        int b = x.nextInt();
        

        for(int c = 0 ; c < a.length; c++){

            if(a[c] == b){
                System.out.println("angka = " + b + " berada di indeks ke " + c);
                
            }

        }
    }
}