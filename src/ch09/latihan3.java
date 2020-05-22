package ch09;

import java.util.Scanner;

public class latihan3 {
    public static long [] a = new long[500];

    public static void koefesien(final int x) {

        a[0] = 1;
        for(int i = 0; i < x; a[0] = -a[0], i++){
            a[1+i] = 1;
            for(int b = i; b > 0; b--)
                a[b] = a[b-1]-a[b];
        }
    }

    public static boolean prima(final int x){
        koefesien(x);
        a[0]++;
        a[x]--;
        int b = x;
        while((b--)>0&&a[b]%x==0);
        return b < 0;
    }

    public static void main(final String[]args) {

        final Scanner nw = new Scanner(System.in);
        System.out.println("Masukan bilangan = ");
        final int z = nw.nextInt();

        if(prima(z))
            System.out.println("Bilangan Prima");
        else
            System.out.println("Bukan Bilangan Prima");
    }
    
} 
