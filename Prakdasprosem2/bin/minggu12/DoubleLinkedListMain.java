package minggu12;

import java.util.Scanner;

import minggu10.Mahasiswa;

public class DoubleLinkedListMain {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih;

        do {

            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Print");
            System.out.println("7. Print Reverse");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim1 = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama1 = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas1 = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk1 = sc.nextDouble();

                    dll.addFirst(new Mahasiswa09(nim1, nama1, kelas1, ipk1));
                    break;

                case 2:

                    System.out.print("NIM   : ");
                    String nim2 = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama2 = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas2 = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk2 = sc.nextDouble();

                    dll.addLast(new Mahasiswa09(nim2, nama2, kelas2, ipk2));
                    break;

                case 3:

                    System.out.print("Masukkan NIM acuan: ");
                    String key = sc.nextLine();

                    System.out.print("NIM baru   : ");
                    String nim3 = sc.nextLine();

                    System.out.print("Nama baru  : ");
                    String nama3 = sc.nextLine();

                    System.out.print("Kelas baru : ");
                    String kelas3 = sc.nextLine();

                    System.out.print("IPK baru   : ");
                    double ipk3 = sc.nextDouble();

                    dll.insertAfter(key,
                            new Mahasiswa09(nim3, nama3, kelas3, ipk3));

                    break;

                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    break;

                case 6:
                    dll.print();
                    break;

                case 7:
                    dll.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}
