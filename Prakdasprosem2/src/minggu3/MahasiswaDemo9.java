package minggu3;

import java.util.Scanner;

public class MahasiswaDemo9 {
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Mahasiswa9[] arrMahasiswa9 = new Mahasiswa9[3];
        String dummy;

        for (int i = 0; i < 3; i++){
            arrMahasiswa9[i] = new Mahasiswa9();

            System.out.println("Masukkan Data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrMahasiswa9[i].nim = daffa.nextLine();
            System.out.print("Nama  : ");
            arrMahasiswa9[i].nama = daffa.nextLine();
            System.out.print("Kelas : ");
            arrMahasiswa9[i].kelas = daffa.nextLine();
            System.out.print("IPK   : ");
            dummy = daffa.nextLine();
            arrMahasiswa9[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa Ke-" + (1 + 1));
            arrMahasiswa9[i].cetakInfo();
        }
    }
}
