package minggu9;

import java.net.Socket;
import java.util.Scanner;

public class SuratMain09 {
     public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        int pilih;
        StackSurat09 stack = new StackSurat09(5);

        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terkahir");
            System.out.println("4. Cari Surat (berdasarkan nama)");
            System.out.print("Pilih : ");
            pilih = cindy.nextInt();
            cindy.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String idSurat = cindy.nextLine();
                    System.out.print("Nama : ");
                    String namaMahasiswa = cindy.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = cindy.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenisIzin = cindy.next().charAt(0);
                    System.out.print("Durasi Izin : ");
                    int durasi = cindy.nextInt();
                    Surat09 srt = new Surat09(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat izin berhasil diinput\n", srt.namaMahasiswa);
                    break;
                case 2:
                    System.out.println("Proses Verifikasi Surat Izin : ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi Izin");
                    stack.print();
                    break;
                case 3:
                    Surat09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir masuk dari " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa : ");
                    String cari = cindy.nextLine();
                    stack.cariSurat(cari);
                    break;
                default:
                    System.out.println("Program Anda Telah Selesai");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
