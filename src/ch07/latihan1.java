package ch07;

public class latihan1 {
    public static void mergesort(int [] a, int b, int c) {

        int rendah= b;
        int tinggi= c;
            if(b >= c) {
            return;

        }

        int tengah = (rendah+tinggi) /2;
            mergesort(a, rendah, tengah);
            mergesort(a, tengah+1, tinggi);

        int akhir = tengah;
        int awal = tengah+1;

                while((b <= akhir)&&(awal<=tinggi)) {
                    if(a[rendah]<a[awal]) {
                    rendah++;
            }

            else {

                int x = a[awal];
                for(int d = awal-1; d >= rendah; d--) {
                    a[d+1]=a[d];
                }

                a[rendah]=x;
                rendah++;
                akhir++;
                awal++;
            }
        }
    }

    public static void main(String[] args) {
        int [] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        mergesort(a, 0, a.length-1);
        for(int b = 0; b < a.length; b++){
            System.out.print(a[b]+" ");

        }
    }
}