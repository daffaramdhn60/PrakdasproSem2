package minggu3;

import java.util.Scanner;

public class MataKuliahDemo9 {
     public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jmlData = daffa.nextInt();
        daffa.nextLine();
        Matakuliah9[] arrayOfMatakuliah08 = new Matakuliah9[jmlData];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = daffa.nextLine();
            System.out.print("Nama       : ");
            nama = daffa.nextLine();
            System.out.print("Sks        : ");
            dummy = daffa.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = daffa.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfMatakuliah08[i] = new Matakuliah9();
            arrayOfMatakuliah08[i].tambahData(nama, dummy, sks, i);;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah08[i].cetakInfo();
            // System.out.println("Kode        : " + arrayOfMatakuliah08[i].kode);
            // System.out.println("Nama        : " + arrayOfMatakuliah08[i].nama);
            // System.out.println("Sks         : " + arrayOfMatakuliah08[i].sks);
            // System.out.println("Jumlah Jam  : " + arrayOfMatakuliah08[i].jumlahjam);
            System.out.println("---------------------------------------");
        }
    }
}