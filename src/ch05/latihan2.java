package ch05;

public class latihan2 {
    int lcs (char [] a, char [] b, int x, int y)
    {
    int [][] c = new int [x + 1][y + 1];

    for(int k = 0; k<=x; k++){
        for(int l = 0; l <=y; l++){
            if (k == 0 || l == 0) 
                c[k][l]= 0;
            else if (a[k-1] == b[l -1])
                c[k][l] = c[k-1][l-1]+1;    
            else
            c[k][l]= max(c[k-1][l], c[k][l-1]);    
            }
        }
    return c[x][y];
    }

    int max (int m, int n)

    {
        return(m > n) ? m:n;
    }

    public static void main(String[] args) {
        
    
        latihan2 lcs = new latihan2();
        String q  = "FBGCSA";
        String q1 = "HICFAB";

        char [] a = q.toCharArray();
        char [] b = q1.toCharArray();
        int x = a.length;
        int y = b.length;

        System.out.println("lenght dari lcs" + " '" + q + "' " + "&" + " '" + q1 + "' " + " = " + " " + lcs.lcs(a,b,x,y));
    }
}