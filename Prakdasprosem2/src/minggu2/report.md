|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2.git |

# Jobsheet 2 - Object

## 2.1 Percobaan 1

Hasil dari percobaan 1 :

![percobaan 1](![alt text](image.png))

### Pertanyaan Percobaan 1 :
1. Sebutkan dua karakteristik class atau object! 

    - Class memiliki dua karakteristik adalah memiliki atribut dan method/fungsi

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya! 

    - Ada 4 yaitu nama, nim, kelas, dan ipk

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 

    - Ada 4 yaitu tampilkanInformasi(), ubahKelas(), updateIpk(), dan nilaiKinerja()

4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0". 

![pertanyaan 4](![alt text](image-1.png))

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut? 

    - nilaikerja() akan menerima nilai ipk lalu dilakukan pengecekan nilai ipk dengan kondisi jika nilai ipk >= 3.5 maka kinerja sangat baik, jika >= 3.0 maka kinerja baik, jika >= 2.0 maka kinerja cukup, dan selain kondisi tersebut kinerja kurang. Hasil dari kondisi tersebut akan dikembalikan untuk ditampilkan ketika method dipanggil

## 2.2 Percobaan 2

Hasil dari percobaan 2 :

![percobaan 2](![alt text](image-2.png))

### Pertanyaan Percobaan 2
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?

    - nama object yang dihasilkan adalah mhs1
![pertanyaan 1](![alt text](image-3.png))

2. Bagaimana cara mengakses atribut dan method dari suatu objek? 

    - Untuk mengakses atribut dapat dilakukan dengan namaObject.namaAtribut = nilai; dan untuk mengakses method dapat dilakukan dengan namaObject.namaMethod();

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

    - Karena sebelum pemanggilan method tampilkanInformasi() yang kedua telah dilakukan perubahan nilai atribut object sehingga hasil yang dihasilkan akan berbeda dengan method tampilkanInformasi() yang pertama

## 2.3 Percobaan 3

Hasil dari percobaan 3 :

![percobaan 3](![alt text](image-4.png))

### Pertanyaan Percobaan 3
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter! Apa nama object yang dihasilkan?

    - Nama object yang dihasilkan adalah mhs2
![pertanyaan 1](i![alt text](image-5.png))

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 

    - Kode tersebut melakukan instansiasi yang membuat object baru yaitu mhs2 dari class mahasiswa yang memiliki parameter dan mengisi nilai awal atribut dengan data yang baru.

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian! 

    - Program error karena object new Mahasiswa() dibuat tanpa parameter dan konstruktor default telah tidak tersedia di class. Sehingga ketika pemanggilan program tidak dapat menemukan konstruktor yg cocok
![pertanyaan 3](![alt text](image-6.png))

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!

    - Tidak, karena pemanggilan method di dalam class dapat dipanggil sesuai dengan kebutuhan

5.  Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa! 

![pertanyaan 5](![alt text](image-7.png))

## 2.4 Latihan Praktikum

### Latihan 1

Hasil dari latihan 1 :

![latihan 1](![alt text](image-8.png))

### Latihan 2

Hasil dari latihan 2 :
![latihan 2](![alt text](image-9.png))