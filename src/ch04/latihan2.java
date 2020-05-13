package ch04;

public class latihan2 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("Bilangan ganjil = ");
        for(int b = 0 ; b < a.length ; b++){
            if(a[b] % 2 != 0){
                
                System.out.print(a[b] + " ");
            }

        }    
    }
}