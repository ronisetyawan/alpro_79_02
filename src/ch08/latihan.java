package ch08;

public class latihan {
    public static String x (String a, String b) {

        int pertama = a.length();
        int kedua = b.length();
        int[][]length = new int[pertama+1][kedua+1];
        int max = 0;
        int akhir = 0;

        for(int i = 0; i < pertama; i++) {
            for(int j = 0; j < kedua; j++) {
                if( i == 0 || j == 0){
                    length[i][j] = 0;
                }

                else if(a.charAt(i-1)==b.charAt(j-1)){
                    length[i][j] = length[i-1][j-1]+1;
                    max = Math.max(max, length[i][j]);
                    akhir = i;
                }

                else {

                    length[i][j] =0;
                }
            }
        }

        return a.substring(akhir-max+1, akhir+1);
    }

    public static void main(String[] args) {
        System.out.println(x("KASUR","RUSAK"));
    }
    

}

