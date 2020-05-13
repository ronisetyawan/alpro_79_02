package ch02;

public class pegawai {
    String  nik;
    String nama;
    String jabatan;
    boolean isAktif;

    public String getnik() {
        return nik;
        
    }    
    public String getnama() {
        return nama;
        
    }
    public String getjabatan() {
        return jabatan;
        
    }
    public boolean getisAktif() {
        return isAktif;
        
    }
    public void cetak() {
        System.out.println("NIK : " + nik );
        System.out.println("NAMA : " + nama );
        System.out.println("JABATAN : " + jabatan );
        System.out.println("isAktif : " + isAktif );
    }
}