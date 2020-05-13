package ch03;

public class latihan2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println("nilai x = " + x);
        System.out.println("nilai y = " + y);
        System.out.println("nilai z = " + z);

        if (x>y && x>z) {
            System.out.println(x + " Adalah nilai tertinggi ");
        
        }else if (y>x && y>z){
            System.out.println(y + " Adalah nilai tertinggi ");

        }else{
            System.out.println(z + " Adalah nilai tertinggi ");
        }

            
      
    }
}