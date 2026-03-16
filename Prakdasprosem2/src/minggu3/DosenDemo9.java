package minggu3;

import java.util.Scanner;

public class DosenDemo9 {
     public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen : ");
        int jmlDosen = daffa.nextInt();
        daffa.nextLine();

        Dosen9[] arrDosen08 = new Dosen9[jmlDosen];
        String kode, nama, jk;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrDosen08.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" +(i + 1));
            System.out.print("Kode  : ");
            kode = daffa.nextLine();
            System.out.print("Nama  : ");
            nama = daffa.nextLine();
            System.out.print("Jenis Kelamin (L / P) : ");
            jk = daffa.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("L"); 
            System.out.print("Usia  : ");
            usia = daffa.nextInt();
            daffa.nextLine();
            System.out.println("---------------------------------------");  

            arrDosen08[i] = new Dosen9(kode, nama, jenisKelamin, usia);
        }

        // for (int i = 0; i < arrDosen08.length; i++) {
        //     System.out.println("Data Dosen ke-" +(i + 1));
        //     arrDosen08[i].cetakInfo();
        // }

        DataDosen9 data = new DataDosen9();

        System.out.println("--- Data Semua Dosen ---");
        data.dataSemuaDosen(arrDosen08);

        System.out.println("--- Jumlah Dosen Per Jenis Kelamin ---");
        data.jumlahDosenPerJenisKelamin(arrDosen08);

        System.out.println("--- Rata - Rata Usia Dosen ---");
        data.rerataUsiaDosenPerJenisKelamin(arrDosen08);

        data.infoDosenPalingMuda(arrDosen08);
        data.infoDosenPalingTua(arrDosen08);
    }
}
