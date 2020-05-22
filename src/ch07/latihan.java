package ch07;

public class latihan {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int x = 0;
    
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if (a[i]<a[j]){
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                    
                }
            }
        }
    
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
    
        }
    }
    
    
    
}