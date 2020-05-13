package ch05;

public class latihan3 {
    static int lis ( int [] b, int c)
    {

    int [] lis = new int [c];
    int x, y, max = 0;

    for (x = 0 ; x<c; x++)
    lis[x] = 1;

    for (x = 1 ; x<c; x++)
     for(y = 0 ; y < x ; y++)
        if(b[x]> b[y] && lis[x]<lis[y]+1)
            lis[x]= lis[y]+1;
    
    for (x = 0; x<c;x++)
     if (max < lis[x])
        max = lis[x];

    return max;

}
public static void main(String[] args) {
    int [] b = {15, 10, 8, 5, 40, 32, 30};
    System.out.println("array = ");
    for (int x = 0 ; x<b.length;x++ ){
        System.out.println(b[x]+ " ");
    } 
    int c = b.length;
    System.out.println();
    System.out.println("Lenght dari lis = " + lis(b, c) + "\n");
    }
}
