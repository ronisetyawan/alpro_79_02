package ch04;

public class latihan12 {
    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;

        System.out.print("data yang ada di array = ");
        for(int b = 0 ; b<a.length; b++){
            System.out.print(a[b] + " ");
        }

        System.out.println("");

        int selisih = a[0] - a[1];
        for(int b = 0; b<a.length; b++){
            if (b==a.length-1) {
                
            }else{
                selisih = a[b]-a[b+1];
                System.out.println("selisih " + a[b] + " dengan " + a[b+1] + " = " + selisih);
                jumlah = jumlah + selisih;
            }
        }
        System.out.println("jumlah angka selisih = " + jumlah);
    }
}