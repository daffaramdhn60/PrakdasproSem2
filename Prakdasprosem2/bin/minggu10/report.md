|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2/tree/main/Prakdasprosem2/bin/minggu10 |

# Jobsheet 10 - Queue

## Percobaan 1
Hasil run dari percobaan 1 :
```
Masukkan kapasistas queue : 4
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
4
Elemen terdepan : 15
```

### Pertanyaan Percobaan 1
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
    - karena front dan rear bernilai -1 menandakan queue masih kosong sedangkan size bernilai 0 menandakan belum ada data di dalam queue.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```
if (rear == max - 1) {
    rear = 0;
```
    - jika rear sudah sampai pada indeks terkahir yaitu max - 1 lalu akan dikembalikan ke awal yaitu 0 agar array dapat digunakan kembali dari depan.
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```
if (front == max - 1) {
    front = 0;
```
    - jika front sudah sampai di posisi akhir array maka front akan kembali ke awal agar pengambilan data tetap berjalan dalam bentuk melingkar.
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
    - karena elemen pertama tidak selalu berada di index 0, bisa saja front sudah bergeser setelah dilakukannya proses dequeue
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
```
i = (i + 1) % max;
```
    - dilakukannya perpindahan index berikutnya dengan perintah i + 1 lalu di modulus dengan max (jika nilai i melebihi batas array maka akan kembali lagi ke 0), kode tersebut menjadikan perulangan dapat berputar terus tanpa keluar dari array
6. Tunjukkan potongan kode program yang merupakan queue overflow! 
    - dibawah ini merupakan kode yang menunjukkan queue overflow
```
if (isFull()) {
    System.out.println("Queue sudah penuh");
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
    - menambahkan System.exit() pada enqueue dan dequeue
```
if (isFull()) {
    System.out.println("Queue sudah penuh");
    System.exit(0);
dan
if (isEmpty()) {
    System.out.println("Queue masih kosong");
    System.exit(0);
```

## Percobaan 2
Hasil run dari percobaan 2 : 
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian : 
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 2
Melayani mahasiswa : 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian : 
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 5
Jumlah dalam antrian : 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 0
Terimakasih
```

### Pertanyaan Percobaan 2
Kode untuk method lihatAKhir :
```
public void lihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.print("Mahasiswa paling belakang : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }
}
```

Hasil run :
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu : 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu : 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu : 6
Mahasiswa paling belakang : NIM - NAMA - PRODI - KELAS
124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu : 0
Terimakasih
```

## Tugas
Gambar Diagram Class AntrianKRS
![Antrian KRS](image/antrianKRS.png)

Hasil run dari tugas :
```
=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 1
NIM   : 125
Nama  : Milen
Prodi : TI
Kelas : 1H
Milen berhasil masuk ke antrian.

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 1
NIM   : 126  
Nama  : Johan
Prodi : TI
Kelas : 1F
Johan berhasil masuk ke antrian.

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 3
Daftar Mahasiswa dalam Antrian : 
NIM - NAMA - PRODI - KELAS
1. 123  Aldi    TI      1A
2. 124  Bobi    TI      1G
3. 125  Milen   TI      1H
4. 126  Johan   TI      1F

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 2
Memproses 2 mahasiswa
123     Aldi    TI      1A
124     Bobi    TI      1G

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 4
Antrian Terdepan : 
125     Milen   TI      1H
126     Johan   TI      1F

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 5
Antrian Paling Akhir : 
126     Johan   TI      1F

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 6
Jumlah Mahasiswa dalam Antrian : 2

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 7
Jumlah yang sudah proses KRS : 2

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 8
Jumlah yang belum proses KRS : 28

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 9
Antrian berhasil dikosongkan

=== Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Semua Antrian
4. Lihat 2 Antrian Terdepan
5. Lihat Antrian Paling Akhir
6. Jumlah Mahasiswa dalam Antrian
7. Jumlah yang Sudah Proses KRS
8. Jumlah yang Belum Proses KRS
9. Kosongkan Antrian
0. Keluar
Pilih menu : 0
Terima kasih
```