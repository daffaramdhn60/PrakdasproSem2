package minggu1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        String [] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thingking and Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        double totalBobot = 0;
        int totalSKS = 8;
        int [] SKS = {2, 2, 3, 2, 2, 2, 2, 2, 2};
        double [] nilaiAngka = new double [mataKuliah.length];
        String [] nilaiHuruf = new String[mataKuliah.length];
        double [] bobot = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
        }
        System.out.println("============================== ");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("============================== ");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk matkul " + mataKuliah[i] + ": ");
            nilaiAngka[i] = daffa.nextDouble();

            for (int j = 0; j < 1; j++) {

                if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                    nilaiHuruf[i] = "A";
                    bobot[i] = 4.0;
                } else if (nilaiAngka[i] > 73) {
                    nilaiHuruf[i] = "B+";
                    bobot[i] = 3.5;
                } else if (nilaiAngka[i] > 65) {
                    nilaiHuruf[i] = "B";
                    bobot[i] = 3.0;
                } else if (nilaiAngka[i] > 60) {
                    nilaiHuruf[i] = "C+";
                    bobot[i] = 2.5;
                } else if (nilaiAngka[i] > 50) {
                    nilaiHuruf[i] = "C";
                    bobot[i] = 2.0;
                } else if (nilaiAngka[i] > 39) {
                    nilaiHuruf[i] = "D";
                    bobot[i] = 1.0;
                } else {
                    nilaiHuruf[i] = "E";
                    bobot[i] = 0.0;
                }
            }

            totalBobot += bobot[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==========================================================================");
        System.out.printf("%-40s %-12s %-12s %-10s\n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-10.2f\n",
                    mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println("==========================================================================");
        System.out.println("IP : " +String.format("%.2f", ip));

        daffa.close();
            
        }
    }
