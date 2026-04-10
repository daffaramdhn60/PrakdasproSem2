|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 254107020033 |
| Nama | Daffa Ramadhan  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2/blob/main/Prakdasprosem2/src/minggu7/

## JOBSHEET VI 

## 6.2.1. Langkah-langkah Percobaan Sequential Search 

``` java

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
        }
}

```

## Hasil Run

``` java

Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.6
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : tio
Kelas   : 2
IPK     : 3.8
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : ila
Kelas   : 2
IPK     : 3.0
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : lia
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : fia
Kelas   : 2
IPK     : 3.3
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.6
----------------------------
Nama: tio
NIM: 222
Kelas: 2
IPK: 3.8
----------------------------
Nama: ila
NIM: 333
Kelas: 2
IPK: 3.0
----------------------------
Nama: lia
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: fia
NIM: 555
Kelas: 2
IPK: 3.3
----------------------------
---------------------------------------------
Pencarian data
---------------------------------------------
```

### 6.2.3. Pertanyaan 

1.  Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi! 
- tampilPosisi hanya menampilkan informasi posisi/indeks di mana data ditemukan, tanpa menampilkan detail datanya. Contoh output: "data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3".
- Sedangkan tampilDataSearch menampilkan detail lengkap data mahasiswa (nim, nama, kelas, ipk) yang ditemukan pada indeks tersebut. Keduanya sama-sama menerima parameter pos untuk mengecek apakah data ditemukan (pos != -1) atau tidak.

2. - break berfungsi untuk menghentikan perulangan for lebih awal begitu data yang dicari sudah ditemukan. Tanpa break, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ketemu, yang berarti membuang waktu komputasi. Dengan break, program langsung keluar dari loop sehingga lebih efisien.

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
- Variabel pos berfungsi sebagai penanda lokasi (indeks array) di mana data yang dicari ditemukan. Nilai awalnya -1 sebagai tanda bahwa data belum/tidak ditemukan. Jika data ditemukan, pos diisi dengan nilai indeks j tempat data tersebut berada. Nilai pos ini kemudian digunakan oleh method tampilPosisi dan tampilDataSearch untuk menentukan apakah data berhasil ditemukan atau tidak, serta untuk mengakses elemen listMhs[pos].

4. - Akan menampilkan data yang pertama kali ditemukan (indeks terkecil). Karena pada sequential search loop berjalan dari indeks 0 ke atas, dan begitu data pertama yang cocok ditemukan langsung dieksekusi break sehingga loop berhenti. Data kedua yang nilainya sama tidak akan pernah dicapai.

5. - Jika break dihapus, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ditemukan di tengah. Akibatnya, jika ada lebih dari satu data dengan nilai IPK yang sama, variabel posisi akan terus ditimpa (overwrite) dengan indeks yang lebih baru. Sehingga hasil akhirnya bukan data pertama yang ditemukan, melainkan data terakhir yang memiliki nilai sama. Selain itu, performa menjadi lebih buruk karena tidak ada early exit.

## 6.3.1. Langkah-langkah Percobaan Binary Search

``` java

package minggu7;

public class mahasiswaberprestasi9 {
    mahasiswa9 [] ListMhs = new mahasiswa9[5];
    int Idx;

    void tambah(mahasiswa9 M){
        if (Idx<ListMhs.length) {
            ListMhs[Idx]=M;
            Idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (mahasiswa9 M:ListMhs){
            M.TampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleshort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            for (int j = 1; j < ListMhs.length-i; j++) {
                if (ListMhs[j].IPK>ListMhs[j-1].IPK) {
                    mahasiswa9 tmp = ListMhs[j];
                    ListMhs[j]=ListMhs[j-1];
                    ListMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionshort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            int IdxMin=i;
            for (int j = i+1; j < ListMhs.length; j++) {
                if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) {
                    IdxMin=j;
                }
            }
            mahasiswa9 Tpm = ListMhs[IdxMin];
            ListMhs[IdxMin] = ListMhs[i];
            ListMhs[i] = Tpm;
        }
    }

    void insertionsort(){
        for (int i = 1; i > ListMhs.length; i++) {
            mahasiswa9 Temp = ListMhs[i];
            int j=i;
            while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
                ListMhs[j] = ListMhs[j - 1];
                j--;
            }
            ListMhs[j] = Temp;
        }
    }
    int  sequentialsearching(double cari){
        int posisi = -1;
        for (int j=0; j<ListMhs.length; j++){
            if (ListMhs[j].IPK==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilposisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos);
        }
        else{
            System.out.println("data" +x+ "tidak ditemukan");
        }
    }
     void tampildatasearch(double x, int pos){
            if (pos!=-1){
                System.out.println("nim\t : " + ListMhs[pos].NIM);
                System.out.println("nama\t : " + ListMhs[pos].Nama);
                System.out.println("kelas\t : " + ListMhs[pos].Kelas);
                System.out.println("ipk\t " +x);
            }
            else{
                System.out.println("data mahasiswa dengan ipk " +x+ "tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid = ( left+right)/2;
            if (cari == ListMhs[mid].IPK){
                return(mid);
            }
            else if (ListMhs[mid].IPK>cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }

        }
        return -1;
    }
}

```

``` java

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

```

## Hasil Run

``` java

Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.1
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : ila
Kelas   : 2
IPK     : 3.2
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : lia
Kelas   : 2
IPK     : 3.3
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : susi
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : anita
Kelas   : 2
IPK     : 3.7
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------------
---------------------------------------------
Pencarian data
---------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
menggunakan sequential searching
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      3.7
----------------------------------------------
Pencarian Data
----------------------------------------------
```

## Hasil Run

1. -    mid = (left + right) / 2;
2. -  else if (listMhs[mid].ipk > cari) {
        return findBinarySearch(cari, left, mid - 1);  // cari di bagian kiri
    } else {
        return findBinarySearch(cari, mid + 1, right); // cari di bagian kanan
    }
3. -  left → batas indeks paling kiri dari rentang array yang sedang ditelusuri.Awalnya bernilai 0.
    - right → batas indeks paling kanan dari rentang array yang sedang ditelusuri. Awalnya bernilai n-1.
    - mid → indeks tengah yang dihitung dari (left + right) / 2. Digunakan sebagai titik perbandingan untuk menentukan apakah pencarian dilanjutkan ke kiri atau ke kanan.
4. - Program tetap bisa berjalan (tidak error), namun hasilnya bisa salah atau data tidak ditemukan meskipun sebenarnya ada. Binary search mengasumsikan data sudah terurut. Jika tidak urut, logika perbandingan left dan right yang mempersempit rentang pencarian menjadi tidak valid — program bisa "salah arah" membuang sisi yang justru berisi data yang dicari, sehingga mengembalikan -1 (tidak ditemukan) secara keliru.
5. - Hasilnya tidak akan ditemukan (return -1). Karena kode asli mengasumsikan data urut ascending, sedangkan data dimasukkan secara descending. Pada kondisi ini ketika listMhs[mid].ipk > cari, program akan mencari ke kiri — padahal data yang lebih kecil justru ada di kanan.
    
    int findBinarySearch(double cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk) {
            return mid;
        } else if (listMhs[mid].ipk < cari) {
            // data descending: yang lebih besar ada di KIRI
            return findBinarySearch(cari, left, mid - 1);
        } else {
            // yang lebih kecil ada di KANAN
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
        }
    6. - Binary search menentukan data tidak ditemukan ketika kondisi right >= left tidak lagi terpenuhi, yaitu saat right < left. Ini berarti rentang pencarian sudah habis dipersempit hingga tidak ada elemen tersisa untuk diperiksa, namun tidak ada yang cocok. Pada titik itu fungsi mengembalikan nilai -1 sebagai tanda data tidak ada dalam array.