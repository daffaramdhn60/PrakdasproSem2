package minggu12;

import java.util.Scanner;

public class RoyalDelishMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            pilihan = Integer.parseInt(scan.nextLine());
 
            switch (pilihan) {
                case 1:
                    // Tambah antrian
                    System.out.print("Nama Pembeli : ");
                    String nama = scan.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = scan.nextLine();
                    antrian.tambahAntrian(nama, noHp);
                    break;
 
                case 2:
                    // Cetak antrian
                    antrian.cetakAntrian();
                    break;
 
                case 3:
                    // Hapus antrian + input pesanan
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada pembeli.");
                        break;
                    }
 
                    // Tampilkan antrian dulu agar kasir tahu nomor yang ada
                    antrian.cetakAntrian();
 
                    System.out.print("\nMasukkan No Antrian yang dipanggil : ");
                    int noAntrian = Integer.parseInt(scan.nextLine());
 
                    Pembeli pembeli = antrian.hapusAntrian(noAntrian);
                    if (pembeli == null) break;
 
                    System.out.println("\n" + pembeli.namaPembeli + " sedang memesan...");
                    System.out.print("Kode Pesanan  : ");
                    int kode = Integer.parseInt(scan.nextLine());
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = scan.nextLine();
                    System.out.print("Harga         : ");
                    int harga = Integer.parseInt(scan.nextLine());
 
                    pesanan.tambahPesanan(kode, namaPesanan, harga);
                    System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    break;
 
                case 4:
                    // Laporan pesanan
                    pesanan.laporanPesanan();
                    break;
 
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
 
                default:
                    System.out.println("Menu tidak valid.");
            }
 
        } while (pilihan != 0);
 
        scan.close();
    }
}
