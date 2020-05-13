package ch02;

public class objectjurusan {
    public static void main(String[] args) {
        jurusan j1 = new jurusan();
        jurusan j2 = new jurusan();
        jurusan j3 = new jurusan();

        j1.nama = "teknik informatika";
        j1.akreditasi = "A";
        j1.jumlahmahasiswa = 1200;

        j2.nama = "sistem informasi";
        j2.akreditasi = "A";
        j2.jumlahmahasiswa = 1090;

        j3.nama = "teknik elektro";
        j3.akreditasi = "A";
        j3.jumlahmahasiswa = 750;

        System.out.println("Jurusan 1");
        System.out.println("Nama : " + j1.getnama());
        System.out.println("Akreditasi : " + j1.getakreditasi());
        System.out.println("Jumlah : " + j1.getjumlahmahasiswa());

        System.out.println("Jurusan 2");
        System.out.println("Nama : " + j2.getnama());
        System.out.println("Akreditasi : " + j2.getakreditasi());
        System.out.println("Jumlah : " + j2.getjumlahmahasiswa());

        System.out.println("Jurusan 3");
        System.out.println("Nama : " + j3.getnama());
        System.out.println("Akreditasi : " + j3.getakreditasi());
        System.out.println("Jumlah : " + j3.getjumlahmahasiswa());
    }
}