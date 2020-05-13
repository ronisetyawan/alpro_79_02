package ch04;

public class latihan4 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int b = 12;

        System.out.print("hanya memiliki angka 2 di array");
        for(int c = 0 ; c<a.length; c++){
            if(a.equals(b)){
                System.out.print(a[c]+ " ");

            }
        }
        
    }
}