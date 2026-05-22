|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2|

# Jobsheet 11 - Linked List

## Praktikum 1
Hasil run dari praktikum 1 :
```
Linked list kosong
Isi Linked List : 
Dirga   21212203        4D      3.6

Isi Linked List : 
Dirga   21212203        4D      3.6
Alvaro  24212200        1A      4.0

Isi Linked List : 
Dirga   21212203        4D      3.6
Bimon   23212201        2B      3.8
Cintia  22212202        3C      3.5
Alvaro  24212200        1A      4.0
```

### Pertanyaan Praktikum 1
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 
    - karena saat program pertama kali dijalankan linked list belum terisi node 
2. Jelaskan kegunaan variable temp secara umum pada setiap method! 
    - variabel temp digunakan sebagai variabel sementara untuk membantu proses node pada linked list
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
```
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
            sll.addLast(mhs);
            sll.print();
        }
```

## Praktikum 2
Hasil run dari praktikum 2 :
```
Isi Linked List : 
Dirga   21212203        4D      3.6
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8
Alvaro  24212200        1A      4.0

Data index 1 : 
Cintia  22212202        3C      3.5
Data mahasiswa an Bimon berada pada index : 2

Isi Linked List : 
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8

Isi Linked List : 
Bimon   23212201        2B      3.8
```

### Pertanyaan Praktikum 2
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
    - Break berfungsi untuk menghentikan perulangan setelah data yang dicari ditemukan dan dihapus, jika break dihapus maka loop akan terus berjalan meskipun data yang dicari telah dihapus
2. Jelaskan kegunaan kode dibawah pada method remove
```
temp.next = temp.next.next;
if (temp.next == null) {
    tail = temp;
}
```
    - digunakan untuk menghapus node setelah temp dan untuk memperbarui nilai tail jika node yang dihapus adalah node terkahir