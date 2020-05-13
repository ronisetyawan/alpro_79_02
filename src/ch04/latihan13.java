package ch04;

public class latihan13 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        

        System.out.print("data yang ada di array = ");
        for(int b = 0 ; b<a.length; b++){
            System.out.print(a[b] + " ");
        }

        System.out.println("");

        int x = 0;
        for (int b = 0; b<a.length;b++){
            for(int array: a){
                if (a[b] < a.length) {
                    x = a.length - a[b];
                }
            }
            System.out.println("jumlah angka sebelum " + a[b] + " = " + x);
        }
    }
}