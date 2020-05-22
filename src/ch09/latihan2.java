package ch09;

import java.util.Arrays;

public class latihan2 {

    public static int sos(int x) {
        int a;
        int b;
        int xBaru = (x-2)/2;
        boolean [] z = new boolean[xBaru+1];

        Arrays.fill(z,false);
        for(a =1; a <= xBaru; a++)
            for(b = a; (a+b+2*a*b) <= xBaru; b++)
                z[a+b+2*a*b] = true;

        if(x > 2)
            System.out.print(2+" ");
                for(a = 1; a <= xBaru; a++)
                    if(z[a]==false)
                        System.out.print(2*a+1+" ");
        return-1;

    }
    public static void main(String[] args) {
        
        int x = 500;
        sos(x);
    }


    
}