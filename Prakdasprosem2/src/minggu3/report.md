|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan|
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2.git |

# Jobsheet 3 - Array Of Object

## 3.2 Percobaan 1

Hasil dari percobaan 1 :

```
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
----------------------------------
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
----------------------------------
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
----------------------------------
```

### Pertanyaan Percobaan 1

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method Jelaskan!
    - tidak harus karena, class bisa hanya berisi atribut saja maupun method saja, atribut digunakan untuk menyimpan data yang akan ditambilkan
2. Apa yang dilakukan oleh kode program berikut?
    - kode program diatas akan membuat arrMahsiswa yang dapat menampunng tiga object mahasiswa
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
    - tidak memiliki konstruktor default namun dapat memanggil kode program berikut karena java otomatis menyediakan konstruktor default
4. Apa yang dilakukan oleh kode program berikut?
    - melakukan proses instansiasi untuk membuat objek dan mengisi nilai dari elemen array
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 
    - karena, dengan dipisah dapat untuk atribut dapat berfokus di class Mahasiswa sedangkan class MahasiswaDemo difokuskan pada logika eksekusinya agar lebih mudah dalam mengelola data

## 3.3 Percobaan 2

Hasil dari percobaan 2 : 

```
Masukkan Data Mahasiswa ke-1
NIM   : 254107867
Nama  : Jace
Kelas : TI - 2F
IPK   : 4.00
-------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 254108987
Nama  : Inas
Kelas : TM - 1M
IPK   : 3.89
-------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 254106547
Nama  : Johan
Kelas : TE - 2A
IPK   : 3.88
-------------------------------
Data Mahasiwa ke-2
NIM     : 254107867
Nama    : Jace
Kelas   : TI - 2F
IPK     : 4.0
----------------------------
Data Mahasiwa ke-2
NIM     : 254108987
Nama    : Inas
Kelas   : TM - 1M
IPK     : 3.89
----------------------------
Data Mahasiwa ke-2
NIM     : 254106547
Nama    : Johan
Kelas   : TE - 2A
IPK     : 3.88
----------------------------
```

### Pertanyaan Percobaan 2

1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3. 
```
Masukkan Data Mahasiswa ke-1
NIM   : 254107564
Nama  : Jace
Kelas : TI - 2G
IPK   : 3.88
-------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 254106897
Nama  : Johan
Kelas : TM - 2G
IPK   : 4.00
-------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 254103456
Nama  : Rama
Kelas : TE - 3D
IPK   : 3.76
-------------------------------
Data Mahasiwa ke-2
NIM     : 254107564
Nama    : Jace
Kelas   : TI - 2G
IPK     : 3.88
----------------------------
Data Mahasiwa ke-2
NIM     : 254106897
Nama    : Johan
Kelas   : TM - 2G
IPK     : 4.0
----------------------------
Data Mahasiwa ke-2
NIM     : 254103456
Nama    : Rama
Kelas   : TE - 3D
IPK     : 3.76
----------------------------
```
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
    - karena myArrayOfMahasiswa hanya membuat slot sebanyak 3 kali namun varibelnya belum dideklarasikan sehingga isi dari arraynya masih null

## 3.4 Percobaan 3

Hasil dari percobaan 3 :

```
Masukkan Data Mahasiswa ke-1
Kode       : 12345
Nama       : Algoritma & Struktur Data
Sks        : 2
Jumlah Jam : 6
-------------------------------------
Masukkan Data Mahasiswa ke-2
Kode       : 54321
Nama       : Sistem Basis Data
Sks        : 2
Jumlah Jam : 4
--------------------------------------
Masukkan Data Mahasiswa ke-3
Kode       : 87654
Nama       : Dasar Pemograman
Sks        : 2
Jumlah Jam : 4
--------------------------------------
Data Matakuliah ke-1
Kode        : 12345
Nama        : Algoritma & Struktur Data
Sks         : 2
Jumlah Jam  : 6
---------------------------------------
Data Matakuliah ke-2
Kode        : 54321
Nama        : Sistem Basis Data
Sks         : 2
Jumlah Jam  : 4
---------------------------------------
Data Matakuliah ke-3
Kode        : 87654
Nama        : Dasar Pemograman
Sks         : 2
Jumlah Jam  : 4
---------------------------------------
```

### Pertanyaan Percobaan 

1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya 
    - bisa, contohnya pada file Matakuliah08 memiliki constructor dengan parameter kode, nama, sks, dan jumlah jam
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah 
```
void tambahData (String kd, String nm, int sks, int jmlJam) {
        kode = kd;
        nama = nm;
        this.sks = sks;
        jumlahjam = jmlJam;
    }
```
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar 
```
void cetakInfo() {
        System.out.println("Kode        : " +kode);
        System.out.println("Nama        : " +nama);
        System.out.println("Sks         : " +sks);
        System.out.println("Jumlah Jam  : " +jumlahjam);
    }
```
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner 
```
System.out.print("Masukkan jumlah data : ");
    int jmlData = cindy.nextInt();
    cindy.nextLine();
```

## Tugas 1

Hasil dari percobaan tugas 1 : 

```
Masukkan jumlah data dosen : 2
Masukkan Data Dosen ke-1
Kode  : 0503424
Nama  : Aisyah Kamila
Jenis Kelamin (L / P) : P
Usia  : 24
---------------------------------------
Masukkan Data Dosen ke-2
Kode  : 345235
Nama  : Akmal Ahmad
Jenis Kelamin (L / P) : L
Usia  : 30
---------------------------------------
Data Dosen ke-1
Kode : 0503424
Nama : Aisyah Kamila
Jenis Kelamin : Wanita
Usia : 24
---------------------------------------
Data Dosen ke-2
Kode : 345235
Nama : Akmal Ahmad
Jenis Kelamin : Pria
Usia : 30
---------------------------------------
```

## Tugas 2

Hasil dari percobaan tugas 2 :

```
Masukkan jumlah data dosen : 3
Masukkan Data Dosen ke-1
Kode  : 0504234
Nama  : Aisyah Kamila
Jenis Kelamin (L / P) : P
Usia  : 24
---------------------------------------
Masukkan Data Dosen ke-2
Kode  : 3452335 
Nama  : Akmal Ahmad
Jenis Kelamin (L / P) : L
Usia  : 30
---------------------------------------
Masukkan Data Dosen ke-3
Kode  : 3423533
Nama  : Lia Nial
Jenis Kelamin (L / P) : P
Usia  : 54
---------------------------------------
--- Data Semua Dosen ---
Kode : 0504234
Nama : Aisyah Kamila
Jenis Kelamin : Wanita
Usia : 24
---------------------------------------
Kode : 3452335
Nama : Akmal Ahmad
Jenis Kelamin : Pria
Usia : 30
---------------------------------------
Kode : 3423533
Nama : Lia Nial
Jenis Kelamin : Wanita
Usia : 54
---------------------------------------
--- Jumlah Dosen Per Jenis Kelamin ---
Jumlah dosen laki - laki : 1 orang
Jumlah dosen perempuan : 2 orang
--- Rata - Rata Usia Dosen ---
Rata - rata usia dosen laki - laki : 30
Rata - rata usia dosen perempuan : 39
--- Dosen Paling Muda ---
Kode : 0504234
Nama : Aisyah Kamila
Jenis Kelamin : Wanita
Usia : 24
---------------------------------------
--- Dosen Paling Tua ---
Kode : 3423533
Nama : Lia Nial
Jenis Kelamin : Wanita
Usia : 54
---------------------------------------
```