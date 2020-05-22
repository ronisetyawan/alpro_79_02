package ch06;

public class latihan2 {
    public static void main(String[] args) {
        
    int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int i = 0; i < a.length-1; i++){
            int nilai = i;
            for(int j = i;j < a.length; j++){
                if(a[j] < a[nilai]){
                nilai = j;

                }
            }

            int x = a[i];
            a[i] = a[nilai];
            a[nilai] = x;
        }

        z(a);
    }

    public static void z(int[] a) {

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");

        }
        
    }
    
}
