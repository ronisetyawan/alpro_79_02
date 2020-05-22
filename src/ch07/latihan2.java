package ch07;

public class latihan2 {
    public static void cocktailsort(int [] a) {

        boolean x;
        do {
            x = false;

            for(int i = 0; i <= a.length-2;i++){
                if(a[i]>a[i+1]){
                    int nilai = a[i];
                    a[i] =a[i+1];
                    a[i+1] = nilai;
                    x = true;
                }
            }

        if(!x) {
        break;

        }

        } while(x);

    }

    public static void main(String[] args) {

        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        cocktailsort(a);
        for(int b = 0; b < a.length; b++) {
            System.out.print(a[b]+" ");

        }
    }
}