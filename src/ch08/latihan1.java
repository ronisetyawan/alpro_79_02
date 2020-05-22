package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1 {
    public void bms (String satu, String dua) {

        char[]text = satu.toCharArray();
        char[]path = dua.toCharArray();
        int skip = indeks(text,path);
        if(skip == -1) {

            System.out.println("Tidak Ada Perbandingan");
        }

        else {

            System.out.println("Path Berada Pada Posisi Ke = "+skip);
        }
    }

    public int indeks(char[]txt,char[]path) {

        if (path.length == 0)
            return 0;

        int charTabel[] = makeCharTabel(path);
        int offsetTabel[] = makeOffsetTabel(path);
        for (int a = path.length - 1, b; a < txt.length;){
            for (b = path.length - 1; path[b] == txt[a]; --a, --b)
                if (b == 0)
                return a;

            a += Math.max(offsetTabel[path.length - 1 - b], charTabel[txt[a]]);
        }

        return -1;

        }

            private int[]makeCharTabel(char[]path){
            final int jumlahAbjad = 356;
            int[]tabel = new int[jumlahAbjad];

                 for(int a = 0; a < tabel.length; a++)
                     tabel[a]=path.length;

                 for (int a = 0; a < path.length-1; ++a)
                    tabel[path[a]]=path.length-1-a;
                    return tabel;
    }

    private static int[]makeOffsetTabel(char[]path) {

        int[]tabel = new int[path.length];
        int posisiTerakhir = path.length;
            for(int a = path.length-1; a >= 0; --a){
            if(awalan(path, a+1))
            posisiTerakhir = a+1;
            tabel[path.length-1-a]=posisiTerakhir-a+path.length-1;
        }

        for(int a = 0; a < path.length-1; ++a){
            int slen = akhiran(path,a);
            tabel[slen] = path.length-1-a+slen;
        }

        return tabel;
    }

    private static boolean awalan(char[]path, int kedua){
        for(int a = kedua, b = 0; a < path.length; ++a, ++b)
            if(path[a]!=path[b])
            return false;
            return true;
    }
    
    private static int akhiran(char[]path, int kedua){
        int x = 0;
        for(int a = kedua, b = path.length-1; a >= 0 && path[a]==path[b];--a,--b)
        x += 1;
        return  x;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Boyer Moore String Search ( BMS )");
        System.out.println("Silahkan Masukan Teks");
        String txt = input.readLine();
        System.out.println("Silahkan Masukan Path");
        String path = input.readLine();
        latihan1 bm = new latihan1();
        bm.bms(txt,path);
    }
    
}
