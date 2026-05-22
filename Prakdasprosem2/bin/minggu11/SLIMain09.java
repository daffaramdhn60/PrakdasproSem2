package minggu11;

import java.util.Scanner;

public class SLIMain09 {
     public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jml = daffa.nextInt();
        daffa.nextLine();
        SingleLinkedList09 sll = new SingleLinkedList09();
        
        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (1 + i));
            System.out.print("NIM : ");
            String nim = daffa.nextLine();
            System.out.print("Nama : ");
            String nama = daffa.nextLine();
            System.out.print("Kelas : ");
            String kelas = daffa.nextLine();
            System.out.print("IPK : ");
            double ipk = daffa.nextDouble();
            daffa.nextLine();

            Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
            sll.print();
        }

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " +sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        // Mahasiswa08 mhs1 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa08 mhs2 = new Mahasiswa08("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa08 mhs3 = new Mahasiswa08("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa08 mhs4 = new Mahasiswa08("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.inserAt(2, mhs2);
        // sll.print();
    }
}
