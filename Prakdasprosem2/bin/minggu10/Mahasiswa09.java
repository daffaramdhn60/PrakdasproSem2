package Prakdasprosem2.bin.minggu10;

public class Mahasiswa09 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa09(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
