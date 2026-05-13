package Prakdasprosem2.bin.minggu4;

import java.util.Scanner;

public class paketpengirimanMain {
     public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        paketpengiriman[] arrPaketPengiriman = new paketpengiriman[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrPaketPengiriman[i] = new paketpengiriman();

            System.out.print("Masukkan nomor resi paket : ");
            arrPaketPengiriman[i].nomorResi = daffa.nextLine(); //Mengisi nilai atribut nomor resi
            System.out.print("Masukkan jumlah berat paket : ");
            dummy = daffa.nextLine();
            arrPaketPengiriman[i].berat = Double.parseDouble(dummy); //Mengisi nilai atribut berat
            System.out.print("Masukkan harga ongkos dasar : ");
            dummy = daffa.nextLine();
            arrPaketPengiriman[i].ongkosDasar = Double.parseDouble(dummy); //Mengisi nilai atribut ongkos dasar
            System.out.println("-------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Berikut adalah data paket ke-" + (i + 1));
            arrPaketPengiriman[i].printData();
        }
    }
}
