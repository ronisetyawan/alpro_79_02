package ch02;

public class objectfakultas {
    public static void main(String[] args) {
        fakultas fk1 = new fakultas();
        fakultas fk2 = new fakultas();

        fk1.nama = "sains dan teknologi";
        fk1.jumlahmahasiswa = 2345;
        
        fk2.nama = "sains dan teknologi";
        fk2.jumlahmahasiswa = 2345;
        
        System.out.println("Fakultas " + fk1.getnama());
        System.out.println("Fakultas " + fk2.getnama());
    }
}