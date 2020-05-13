package ch02;

public class objecttrapesium {
    public static void main(String[] args) {
        trapesium Trapesium = new trapesium();
        Trapesium.alasbawah = 25;
        Trapesium.alasatas = 18;
        Trapesium.tinggi = 12;
        System.out.println("Luas trapesium = " + Trapesium.luas());
    }
}