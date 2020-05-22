package ch06;


public class latihan {
    public static void main(String[] args) {
       int[] a = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };

        System.out.println("array sebelum di bubble sort = ");
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + " ");
        }

        System.out.println();
        System.out.println("array setelah di bubble sort = ");
        for (int b = 0; b < a.length; b++) {
            for (int c = 0; c<a.length-1;c++) {
                if (a[c] < a[c + 1]) {
                   int x = a[c];
                   a[c]   = a[c+1];
                   a[c+1] = x;  
                }
            }
        }
        
        for(int b = 0 ; b<a.length;b++){
            System.out.print(a[b] + " ");
        }


    }
}