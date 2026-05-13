package Prakdasprosem2.bin.minggu10;

import java.util.Scanner;

public class KRSMain {
     public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah yang Sudah Proses KRS");
            System.out.println("8. Jumlah yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = cindy.nextInt(); cindy.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = cindy.nextLine();
                    System.out.print("Nama  : ");
                    String nama = cindy.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = cindy.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = cindy.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa dalam Antrian : " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS : " + antrian.jumlahSudahProses());
                    break;
                case 8:
                    System.out.println("Jumlah yang belum proses KRS : " + antrian.belumProses());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        cindy.close();
    }
}
