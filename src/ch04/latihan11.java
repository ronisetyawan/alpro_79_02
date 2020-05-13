package ch04;

public class latihan11 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("data yang ada di array = ");
        for(int b = 0 ; b<a.length; b++){
            System.out.print(a[b] + " ");
        }
        
        System.out.println("");
        int x = a[0] + a[1];
        for(int b = 0; b<a.length; b++){
            if(a[b]%2==0){
                x = a[b]+a[b+1];
            if (x%2==0) {
                System.out.println(a[b] + " + " + a[b+1] + " = " + x);
                
            }    
            }
        }
    }
}