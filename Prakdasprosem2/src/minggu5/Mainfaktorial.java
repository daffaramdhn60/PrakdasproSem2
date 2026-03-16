package minggu5;

import java.util.Scanner;

public class Mainfaktorial {
    public static void main(String[] args) {
        
        Scanner daffa = new Scanner(System.in);
        System.out.print(" Masukkan nilai: " );
        int nilai = daffa.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Nilai faktorial" + nilai + "menggunakan BF:" + fk.FaktorialBf (nilai));
        System.out.println("Nilai faktorial" + nilai + "menggunakan DC:" + fk.faktorialDC (nilai));
    }
}
