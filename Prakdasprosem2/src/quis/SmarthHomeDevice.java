package quis;

import java.util.Scanner;

public class SmarthHomeDevice{
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        String Nama, keterangan;
        double KonsumsiPower;
        double StandbyPower;

        System.out.print("Penjumlahan konsumsi power dan standby power");
        double totalEnergiActual = daffa.nextDouble();
        System.out.print("Presentase dari nilai standby power dibanding dengan energi actual");
        double rasioEfisiensi = daffa.nextDouble();

        if (totalEnergiActual < 0 || totalEnergiActual > 10 ||
            rasioEfisiensi < 0 || rasioEfisiensi > 10){
                 System.out.println("tampilkan device yang paling efisien");
                 return;
            }
        double tampilkan;
        String ratarata, totalenergi;

        if (tampilkan> 10 ) ratarata = "A";
            else if (tampilkan > 9) ratarata = "B";
            else if (tampilkan > 8) ratarata = "C";
            else if (tampilkan > 7) ratarata = "D";
            else ratarata = "E";
            
            if (ratarata.equals("A") || ratarata.equals("B+") ||
            ratarata.equals("B") || ratarata.equals("C+") ||
            ratarata.equals("C"))
            keterangan = "LULUS";
        else
            keterangan = "TIDAK LULUS";

        System.out.println("Nilai Akhir : " + tampilkan);
        System.out.println("Nilai Huruf : " + ratarata);
        System.out.println("Keterangan  : " + keterangan);

        daffa.close();
    }
}
