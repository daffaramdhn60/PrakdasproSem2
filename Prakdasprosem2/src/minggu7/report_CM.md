|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 254107020033 |
| Nama | Daffa Ramadhan  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2/tree/main/Prakdasprosem2/src/minggu6

## JOBSHEET Studi Kasus 1 
``` java
package minggu7;

import java.util.Scanner;

public class mahasiswa9_CM {
    String nim,nama,prodi;

    mahasiswa9_CM(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilprodimahasiswa(){
        System.out.println(nim +  "|" + nama + "|" + prodi);
    }
}
```
### Hasil Run
``` java
Masukkan Data Nahasiswa Ke-1
NIM     : 222
Nama    : ade
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-2
NIM     : 333
Nama    : adi
Kelas   : 2
IPK     : 3.3
Masukkan Data Nahasiswa Ke-3
NIM     : li
Nama    : lia
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : adu
Kelas   : 2
IPK     : 3.6
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : dari
Kelas   : 2
IPK     : 3.7
Nama: ade
NIM: 222
Kelas: 2
IPK: 3.5
----------------------------
Nama: adi
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: lia
NIM: li
Kelas: 2
IPK: 3.5
----------------------------
Nama: adu
NIM: 444
Kelas: 2
IPK: 3.6
----------------------------
Nama: dari
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
nama     : dari
kelas    : 2
ipk      3.7
----------------------------------------------
Pencarian Data
----------------------------------------------
```

``` java 
package minggu7;

public class buku9_CM {
    String kode;
    String judul;
    int tahun;

    buku9_CM(String kode, String judul, int tahun){
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }
    void tampildatabuku(){
        System.out.println(kode + "|" + judul + "|" + tahun);
    }
}
```
``` java
public class peminjaman9_CM {
    mahasiswa9_CM mhs; 
    buku9_CM buku;     
    int lamaPinjam;
    int denda;

    peminjaman9_CM(mahasiswa9_CM mhs, buku9_CM buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int telat = lamaPinjam - batas;

        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampildatapeminjaman() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
```
