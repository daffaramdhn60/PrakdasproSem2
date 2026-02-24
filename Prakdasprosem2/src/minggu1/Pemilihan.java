package minggu1;

import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = daffa.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = daffa.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = daffa.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = daffa.nextDouble();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        String nilaiHuruf, keterangan;

        if (nilaiAkhir > 80) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C"))
            keterangan = "LULUS";
        else
            keterangan = "TIDAK LULUS";

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan  : " + keterangan);

        daffa.close();
    }
}