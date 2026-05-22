package Prakdasprosem2.bin.minggu11;

public class Mahasiswa09 {
     String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa09() {

    }

    Mahasiswa09(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
