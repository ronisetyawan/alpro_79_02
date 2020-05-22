package ch06;

public class latihan1 {
    public static void main(String[] args) {
        int[] a = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };

        System.out.println("array setelah di insertion sort = ");
        for(int b=0; b<a.length;b++){ 
            int x=a[b];
            int c=b;
            while((c>0)&&(x<a[c-1])){
            a[c]=a[c-1];
            c --;
            
            }
            a[c]=x;
            }
            
            for(int b=0; b<a.length; b++){
                System.out.print(a[b]+" ");
        
        }
    }
}