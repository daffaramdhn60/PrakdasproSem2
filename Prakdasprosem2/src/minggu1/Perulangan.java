package minggu1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nimMhs = daffa.nextLine();
     
        System.out.print("Masukkan 2 digit terakhir NIM: ");

        int n = daffa.nextInt();
            if (n < 10) {
            n = n + 10;
        }
        

        for (int i = 0; i <= n; i++) {
            if ( i == 10 || i == 15) {
                continue;
            } if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
