package ch08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class latihan2 {
    private int [] x;
    public latihan2(String text, String patt) {

        x = new int[patt.length()];
        fail(patt);

        int skip = SkipPerbandingan(text, patt);
        if (skip == -1)
            System.out.println("Tidak Ada Perbandingan");
        else
            System.out.println("Perbandingan Terletak Pada Indeks-"+skip);
    }

    private void fail(String pat) {
        int pertama = pat.length();
        x[0] = -1;
        for(int b = 1; b < pertama; b++) {

            int a = x[b-1];
            while((pat.charAt(b)!= pat.charAt(a+1))&&a>=0)
                a = x[a];
            if(pat.charAt(b) == pat.charAt(a+1))
                x[b]= a+1;
            else
                x[b] = -1;
        }
    }

    private int SkipPerbandingan(String txt, String pat){
        int a = 0;
        int b = 0;
        int lens = txt.length();
        int lenp = pat.length();
        while(a < lens && b < lenp) {

            if(txt.charAt(a)==pat.charAt(b)) {
                a++;
                b++;
            }

            else if(b == 0)
                a++;
            else
                b = x[b-1]+1;
        }

        return((b==lenp)?(a-lenp):-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Algoritma Knouth Mooris Pratt");
        System.out.println("Silahkan Masukan Teks");
        String txt = input.readLine();
        System.out.println("Silahkan Masukan Path");
        String pat = input.readLine();
        latihan2 kmp = new latihan2(txt, pat);
    }


}

