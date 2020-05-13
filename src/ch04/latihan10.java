package ch04;

public class latihan10 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("data yang ada di array = ");
        for(int b = 0 ; b<a.length; b++){
            System.out.print(a[b] + " ");
        }
        
        System.out.println("");

        System.out.print("angka terbesar setelah = ");
        int x = a[0];
        for(int b = 0 ; b<a.length; b++){
            for(int c = 1 ; c<a.length-1; c++){
                if (a[c]>a[b]) {
                    x = a[c];
                    System.out.print(a[b] + " < " + x + " | ");
                    
                }
            }
            System.out.println("");
            
        }

    }
}