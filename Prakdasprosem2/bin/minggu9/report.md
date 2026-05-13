|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2/tree/main/Prakdasprosem2/bin/minggu9 |

# Jobsheet 9 - Stack

## Percobaan 1

Hasil dari percobaan 1 : 
```
Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama : Dila
NIM : 1001
Kelas : 1A
Tugas Dila berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama : Erik
NIM : 1002
Kelas : 1B
Tugas Erik berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 3
Tugas terakhir dikumpulkan oleh Erik

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama : Tika
NIM : 1003
Kelas : 1C
Tugas Tika berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 2
Menilai tugas dari Tika
Masukkan nilai (0-100) : 87
Nilai Tugas Tika adalah 87

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
```

### Pertanyaan Percobaan 1
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki? 
    - Mengubah kondisi perulangan pada method print menjadi kode dibawah ini:
```
for (int i = top; i >= 0; i--) {
```
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya! 
    - Data yang dapat ditampung sebanyak 5
```
StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
```
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya? 
    - Pengecekan !isFull digunakan untuk memastikan stack masih memiliki ruang kosong sebelum data baru ditambahkan karena stack memiliki kapasitas yang terbatas (pada program kapasitas stack hanya ada 5), ketika if-else dihapus maka akan terjadi ArrayIndexOutOfBoundsException (index array sudah melebihi kapasitas)
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah! 
```
Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
Pilih : 1
Nama : Dila
NIM : 1001
Kelas : 1A
Tugas Dila berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
Pilih : 1
Nama : Erik
NIM : 1002
Kelas : 1B
Tugas Erik berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
Pilih : 1
Nama : Tika
NIM : 1003
Kelas : 1C
Tugas Tika berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
Pilih : 5
Daftar semua tugas
Nama    NIM     Kelas
Tika    1003    1C
Erik    1002    1B
Dila    1001    1A

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
Pilih : 4
Tugas pertama dikumpulkan oleh Dila
```
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya! 
```
Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Dila
NIM : 1001
Kelas : 1A
Tugas Dila berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Johan
NIM : 1002
Kelas : 1B
Tugas Johan berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1   
Nama : Mile
NIM : 1003
Kelas : 1C
Tugas Mile berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 6
Jumlah tugas yang sudah dikumpulkan : 3
```

## Percobaan 2
Hasil dari percobaan 2 :
```
Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Dila 
NIM : 1001
Kelas : 1A
Tugas Dila  berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Erik
NIM : 1002
Kelas : 1B
Tugas Erik berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Tika
NIM : 1003
Kelas : 1C
Tugas Tika berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 2
Menilai tugas dari Tika
Masukkan nilai (0-100) : 87
Nilai Tugas Tika adalah 87
Nilai Biner Tugas : 1010111
```

### Pertanyaan Percobaan 2
1. Jelaskan alur kerja dari method konversiDesimalKeBiner! 
    - Menginputkan nilai terlebih dahulu lalu yang pertama program akan membuat stack untuk menyimpan hasil sisa pembagian, yang kedua akan dilakukan pengecekan kondisi apakah nilai desimal tersebut lebih besar dari 0, jika iya maka nilai akan di modulus (%) dengan 2. Hasil sisa modulus akan disimpan di stack menggunakan method push, kemudian nilai akan dibagi dengan 2. Setelah seluruh hasil sisa modulus tersimpan, program akan membuat varibel String dengan nama biner. Kemudian isi stack akan diambil satu per satu menggunakan method pop sampai kosong, nilai yang terkahir masuk akan keluar lebih dulu sehingga urutan digit benar. Setelah itu nilai yang diambil akan digabungkan kembali ke dalam String biner dan hasilnya akan dikembalikan dalam bentuk bilangan biner.
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
    - Mengubah kondisi menjadi nilai != 0 tidak akan mengubah hasil konversi selama varibel nilai masih berisi dengan nilai/angka. Perulangan akan tetap berhenti ketika angka sudah menjadi 0, namun jika varibel nilai tidak di deklarasi maka program akan mengalami error.
```
Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 1
Nama : Tika
NIM : 1003
Kelas : 1C
Tugas Tika berhasil dikumpulkan

Menu
1. Mengumpulkan tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Tugas Terbawah
5. Melihat Daftar Tugas
6. Melihat Jumlah Tugas
Pilih : 2
Menilai tugas dari Tika
Masukkan nilai (0-100) : 87
Nilai Tugas Tika adalah 87
Nilai Biner Tugas : 1010111
```

## Latihan Praktikum
Hasil dari latihan praktikum : 
```
Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 1
ID Surat : 1345
Nama : Johan
Kelas : 1B
Jenis Izin (S/I) : S
Durasi Izin : 2
Surat izin berhasil diinput

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 1
ID Surat : 1653
Nama : Milen
Kelas : 1D
Jenis Izin (S/I) : I
Durasi Izin : 2
Surat izin berhasil diinput

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 1
ID Surat : 1763
Nama : Dika
Kelas : 1G
Jenis Izin (S/I) : I
Durasi Izin : 5
Surat izin berhasil diinput

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 2
Proses Verifikasi Surat Izin : 
ID Surat        Nama    Kelas   Jenis Izin      Durasi Izin
1345            Johan   1B      S               2
1653            Milen   1D      I               2
1763            Dika    1G      I               5


Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 3
Surat izin terakhir masuk dari Dika

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 4
Masukkan nama mahasiswa : Johan
Surat izin ditemukan

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terkahir
4. Cari Surat (berdasarkan nama)
Pilih : 5
Program Anda Telah Selesai
```