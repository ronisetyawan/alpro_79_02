package ch04;

public class latihan9 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("data yang ada di array = ");
        for(int b = 0 ; b < a.length; b++){
            System.out.print(a[b] + " ");
        }

        System.out.println("");

        int selisih = a[0]-a[1];
        for(int b = 0 ; b < a.length ; b++){
            for(int c = b+1 ; c < a.length ; c++){
                if ((a[b]%2==0) && (a[c]%2==0)) {

                    selisih = a[b] - a[c];
                    System.out.println("selisih = " + a[b] + " dengan " + a[c] + " = " + selisih);
                    
                }
            }
        }
    }
}