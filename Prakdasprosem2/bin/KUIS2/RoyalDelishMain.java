package KUIS2;

import java.util.Scanner;

public class RoyalDelishMain {
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        DLLAntrian antrian = new DLLAntrian();
        DLLPesanan pesanan = new DLLPesanan();
        int pilihan;
 
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = Integer.parseInt(daffa.nextLine());
 
            switch (pilihan) {
                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = daffa.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = daffa.nextLine();
                    antrian.tambahAntrian(nama, noHp);
                    break;
 
                case 2:
                    antrian.cetakAntrian();
                    break;
 
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada pembeli.");
                        break;
                    }

                    antrian.cetakAntrian();
 
                    System.out.print("\nMasukkan No Antrian yang dipanggil : ");
                    int noAntrian = Integer.parseInt(daffa.nextLine());
 
                    Pembeli pembeli = antrian.hapusAntrian(noAntrian);
                    if (pembeli == null) break;
 
                    System.out.println("\n" + pembeli.namaPembeli + " sedang memesan...");
                    System.out.print("Kode Pesanan  : ");
                    int kode = Integer.parseInt(daffa.nextLine());
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = daffa.nextLine();
                    System.out.print("Harga         : ");
                    int harga = Integer.parseInt(daffa.nextLine());
 
                    pesanan.tambahPesanan(kode, namaPesanan, harga);
                    System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    break;
 
                case 4:
                    pesanan.laporanPesanan();
                    break;
 
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
 
                default:
                    System.out.println("Menu tidak valid.");
            }
 
        } while (pilihan != 0);
 
        daffa.close();
    }
}
