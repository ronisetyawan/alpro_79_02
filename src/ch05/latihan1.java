package ch05;

public class latihan1 {
    public static int kadane(int [] x) {

        int a = 0 ;
        int b = 0;

        for (int c = 0; c<x.length;c++){
        a += x[c];
        if (a<0) {
            a = 0;
            
        }
        if (b<a) {
            b = a;
            
        }
        }
        return b;
    }
    public static void main(String[] args) {
        int [] x = {4, 6, 7, -8, 2, 5, -3, 1};
        System.out.println("array = ");
        for(int c = 0; c < x.length; c++ ){
            System.out.println(x[c] + " ");
        }
        latihan1 maxSum = new latihan1();
        System.out.println();
        System.out.println("Nilai maksimum subarraynya = " + maxSum.kadane(x));
        
    }
}