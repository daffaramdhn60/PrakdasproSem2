package minggu7;

import java.util.Scanner;

public class mahasiswademo9 {
     public static void main(String[] args) {
            //mahasiswaberprestasi9 List = new mahasiswaberprestasi9();
           Scanner daffa9 = new Scanner(System.in);
            mahasiswaberprestasi9 List = new mahasiswaberprestasi9();
            int JmlMhs = 5;
    
            for (int i = 0; i < JmlMhs; i++) {
                System.out.println("Masukkan Data Nahasiswa Ke-" + (i+1));
                System.out.print("NIM     : ");
                String NIM = daffa9.nextLine();
                System.out.print("Nama    : ");
                String Nama = daffa9.nextLine();
                System.out.print("Kelas   : ");
                String Kelas = daffa9.nextLine();
                System.out.print("IPK     : ");
                String InputIPK = daffa9.nextLine();
                double IPK = Double.parseDouble(InputIPK);

                List.tambah(new mahasiswa9(NIM, Nama, Kelas, IPK));

                //mahasiswa9 m = new mahasiswa9(NIM, Nama, Kelas, IPK);
                //List.tambah(m);
            }
            //mahasiswa9 M1 = new mahasiswa9("123", "Zidan", "2A", 3.2);
            //mahasiswa9 M2 = new mahasiswa9("124", "Ayu", "2A", 3.5);
            //mahasiswa9 M3 = new mahasiswa9("125", "Sofi", "2A", 3.1);
            //mahasiswa9 M4 = new mahasiswa9("126", "Sita", "2A", 3.9);
            //mahasiswa9 M5 = new mahasiswa9("127", "Miki", "2A", 3.7);
    
            //List.Tambah(M1);
            //List.Tambah(M2);
            //List.Tambah(M3);
            //List.Tambah(M4);
            //List.Tambah(M5);
    
            //System.out.println("Data Mahasiswa Sebelum Sorting: ");
            //List.tampil();
    
            //System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
            //List.bubbleshort();
            //List.tampil();
    
            //System.out.println("Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)");
            //List.selectionshort();
            //List.tampil();
            
            //System.out.println("Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)");
            //List.insertionsort();
            //List.tampil();

            //List.tampil();

            List.tampil();
            //melakukan pencarian data sequential
            System.out.println("---------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("---------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = daffa9.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = List.sequentialsearching(cari);
            int pss = (int)posisi;
            List.tampilposisi(cari, pss);
            List.tampildatasearch(cari, pss);

            //melakukan pencarian data Binary
            System.out.println("----------------------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("----------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            String inputcari2 = daffa9.nextLine().replace(",", ".");
            double Cari = Double.parseDouble(inputcari2);
             System.out.println("----------------------------------------------");
             System.out.println("menggunakan binary search");
             System.out.println("----------------------------------------------");
             double posisi2 = List.findBinarySearch(cari, 0, JmlMhs-1);
            int pss2= (int)posisi2;
            List.tampilposisi(cari, pss2);
            List.tampildatasearch(cari, pss2);
        }
}
