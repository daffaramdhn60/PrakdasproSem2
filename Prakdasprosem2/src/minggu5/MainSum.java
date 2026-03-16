package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {

    Scanner daffa = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen:" );
    int elemen = daffa.nextInt();

    Sum sm = new Sum(elemen);
    for (int i=0; i < elemen; i++){
        System.out.print("Masukkan keuntungan ke-" + (i+1) + ":");
        sm.keuntungan[i] = daffa.nextDouble();
    }
    System.out.println("Total keuntungan menggunakan BruteForce: " + sm.totalBf());
    System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, l:0, elemen-1));
    }
}