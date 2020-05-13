package ch03;

import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.printf("Input sebuah bilangan : ");
        int n = s.nextInt();
        int b = 0;
        for(int i=1;i<=n;i++){
        if(n%i==0)
            b=b+1;  }
        if(b==2)
            System.out.printf("Prima ");
        else
            System.out.printf("Bukan Prima ");
    }
}