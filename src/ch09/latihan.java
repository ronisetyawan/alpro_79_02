package ch09;

public class latihan {
    public static int soa (int a) {

        if(a>2)
            System.out.print (2+" ");

        else if(a>3)
            System.out.println (3+" ");

        boolean sieve [] = new boolean [a];

        for(int i = 0; i < a; i++)
            sieve[i]= false;

        for(int j = 1; j < a; j++) {
            for(int k = 1; k * k < a; k++) {

            int d = ( 4 * j * j ) + ( k * k );
            if(d <= a && (d % 12 == 1||d  % 12 == 5))
                sieve[d] ^= true;

            }
        }

        for(int e = 5; e*e<a; e++){
            if(sieve[e]){
                for(int f = e*e; f < f; f += e*e)
                    sieve[e]=false;
            }
        }

        for (int prima = 5; prima < a; prima++)
            if(sieve[prima])
                System.out.print(prima+" ");
        return 0;

    }
    public static void main(String[] args) {
        int a = 500;
        soa(a);
    }

    
}

