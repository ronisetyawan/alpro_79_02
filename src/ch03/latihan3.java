package ch03;

import java .util.Scanner;
public class latihan3 {
public static void main(String[] args) {
    Scanner bil = new Scanner(System.in);
    int x = 0;
    int y = 3;

    System.out.println("program menentukan pembagi terkecil");
    
    System.out.println("Masukkan angka = ");
    x = bil.nextInt();

    System.out.println("------------------------------------");

    while (y>=x) {
        if( (x%y) !=0 ){

        }else{
            System.out.println("Pembagi terkecil adalah " + y);
            y=y+1;
    }

    }
    }
}
