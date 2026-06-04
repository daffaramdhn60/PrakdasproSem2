|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2 |

# Jobsheet 14 - Tree

## Praktikum 1
Hasil run dari praktikum 1 : 
```
Daftar semua mahasiswa (in order traversal) : 
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.21
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.54
NIM    : 244160121 Nama   : Ali Kelas  : A IPK    : 3.57
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.85

Pencarian data mahasiswa : 
Cari mahasiswa dengan ipk : 3.54 : Ditemukan
Cari mahasiswa dengan ipk : 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa : 
InOrder Traversal : 
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.21
NIM    : 244160205 Nama   : Ehsan Kelas  : D IPK    : 3.37
NIM    : 244160170 Nama   : Fizi Kelas  : B IPK    : 3.46
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.54
NIM    : 244160121 Nama   : Ali Kelas  : A IPK    : 3.57
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.72
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.85

PreOrder Traversal : 
NIM    : 244160121 Nama   : Ali Kelas  : A IPK    : 3.57
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.21
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.54
NIM    : 244160205 Nama   : Ehsan Kelas  : D IPK    : 3.37
NIM    : 244160170 Nama   : Fizi Kelas  : B IPK    : 3.46
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.85
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.72

PostOrder Traversal : 
NIM    : 244160170 Nama   : Fizi Kelas  : B IPK    : 3.46
NIM    : 244160205 Nama   : Ehsan Kelas  : D IPK    : 3.37
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.54
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.21
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.72
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.85
NIM    : 244160121 Nama   : Ali Kelas  : A IPK    : 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal) : 
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.21
NIM    : 244160205 Nama   : Ehsan Kelas  : D IPK    : 3.37
NIM    : 244160170 Nama   : Fizi Kelas  : B IPK    : 3.46
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.54
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.72
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.85
```

### Pertanyaan Praktikum 1
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? 
    - karena dalam binary search tree menyimpan data dengan aturan nilai yang lebih kecil dari parent berada di subtree kiri dan nilai yang lebih besar dari parent berada di subtree kanan, sedangkan dalam binary tree biasa tidak ada aturan untuk menyimpan data sehingga dilakukan pengecekan node secara satu per satu
2. Untuk apakah di class Node, kegunaan dari atribut left dan right? 
    - atribut left dan right digunakan untuk menyimpan referensi ke anak dari suatu node (keft = anak kiri, right = anak kanan)
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? 
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? 
    - a. atribut root digunakan untuk menyimpan node paling atas dari tree
    - b. ketika objek tree pertama kali dibuat nilai dari root adalah null karena pada program tertulis sebagai berikut
    ```
    public BinaryTree08() {
        root = null;
    }
    ```
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? 
    - ketika tree masih kosong maka root masih bernilai null, setelah dilakukan penambahan node maka node baru tersebut akan menjadi root karena tidak node yang dapat dibandingkan dan tidak ada anak kiri atau anak kanan yang dapat dituju
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut? 
```
parent = current;
if (mahasiswa.ipk < current.mahasiswa.ipk) {
    current = current.left;
    if (current == null) {
        parent.left = newNode;
        return;
    }
} else {
    current = current.right;
    if (current == null) {
        parent.right = newNode;
        return;
    }
}
```
    - pada baris kode program parent = current digunakan untuk menyimpan node saat ini (current) sebagai parent lalu akan dilakukan pengecekan kondisi apakah IPK yang dimasukkan lebih kecil dari node saat ini. Jika iya, maka data harus ditempatkan di subtree kiri (anak kiri) lalu pointer current akan berpindah ke anak kiri. Jika tidak, maka data harus ditempatkan di subtree kanan (anak kanan) lalu pointer current akan berpindah ke anak kanan. Setelahnya dilakukan pengecekan apakah posisi node saat ini kosong, jika iya node baru akan dipasang sebagai anak kiri atau anak kanan dari parent kiri / parent kanan. Hal tersebut ditentukan setelah dilakukan pengecekan dengan kode 'if (mahasiswa.ipk < current.mahasiswa.ipk) {'
6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
    - langkah pertama dilakukan pencarian successor menggunakan getSuccessor setelah successor ditemukan, maka successor akan dipindahkan ke posisi node yang ingin dihapus (jika node yang dihapus adalah root, maka root akan digantikan dengan successor). Lalu anak kiri dari node yang ingin dihapus dihubungkan ke successor, kemudian node yang lama akan di hapus

## Praktikum 2
Hasil run dari praktikum 2 :
```
Inorder Traversal Mahasiswa : 
NIM    : 244160220 Nama   : Dewi Kelas  : B IPK    : 3.35
NIM    : 244160185 Nama   : Candra Kelas  : C IPK    : 3.41
NIM    : 244160131 Nama   : Devi Kelas  : A IPK    : 3.48
NIM    : 244160121 Nama   : Ali Kelas  : A IPK    : 3.57
NIM    : 244160205 Nama   : Ehsan Kelas  : D IPK    : 3.61
NIM    : 244160221 Nama   : Badar Kelas  : B IPK    : 3.75
NIM    : 244160170 Nama   : Fizi Kelas  : B IPK    : 3.86
```

### Pertanyaan Praktikum 2
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? 
    - atribut data digunakan untuk menyimpan seluruh node pada Binary Tree Array dan atribut idxLast digunakan untuk menyimpan indeks terkahir yang memiliki data pada array
2. Apakah kegunaan dari method populateData()? 
    - method populateData() digunakan untuk mengisi array dengan node yang sudah dibuat sebelumnya (proses inisialisasi data di class Binary Tree Array)
3. Apakah kegunaan dari method traverseInOrder()? 
    - method traverseInOrder digunakan untuk menampilkan data yang sudah terurut dari nilai terkecil ke nilai terbesar
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing? 
    - posisi left child berada pada indeks 5 dan posisi right child berada pada indeks 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? 
    - idxLast = 6 menunjukkan bahwa indeks terkahir adalah indeks 6 sehingga traversal hanya dilakukan sampai indeks terkahir (indeks 6) 
6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
    - karena data disimpan dalam bentuk array pada binary tree maka hubungan antara parent dan child ditentukan berdasarkan posisi indeksnya dengan aturan anak kiri berada pada indeks 2 * i (idxStart) + 1 dan anak kanan berada pada indeks 2 * i (idxStart) + 2 sehingga ketika method rekursif ingin memanggil anak kiri dan anak kanan dari suatu node maka program cukup menggunakan aturan tersebut untuk menghitung indeksnya