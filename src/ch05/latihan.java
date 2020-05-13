package ch05;

public class latihan {
    public static int euclidean(int a, int b) {

        if(a == 0)
        return b;

        return euclidean(b % a, a);
        
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 10, c;
        c = euclidean(a, b);

        System.out.println("euclidean dari (" + a + " , " + b + ") = " + c);

    }
 
}