package Prakdasprosem2.bin.minggu10;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + "\t" + nama + "\t" + prodi + "\t" + kelas);
    }
}
