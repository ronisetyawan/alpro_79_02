package ch09;

public class latihan1 {
    public static void soe (int x) {

        boolean prima[] = new boolean[x+1];

        for(int a = 0; a < x; a++)
            prima[a] =  true;

        for(int b = 2; b*b <= x; b++){
            if(prima[b]==true){
                for(int a = b*b; a <= x; a+=b)
                    prima[a]=false;
            }
        }

        for(int a =2; a <= x; a++){
            if(prima[a]==true)
                System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int x = 500;
        latihan1.soe(x);
    }
    

}