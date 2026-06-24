|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020033|
| Nama |  Daffa Ramadhan |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/daffaramdhn60/PrakdasproSem2 |


Hasil kode dari praktikum : 
```java
public class PesertaLomba09 {
    int idPeserta;
    String nama;
    String asal;
    int skor;

    public PesertaLomba09 (int idPeserta, String nama, String asal, int skor) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.asal = asal;
        this.skor = skor;
    }

    public void tampil() {
        System.out.println("ID      : " + idPeserta);
        System.out.println("Nama    : " + nama);
        System.out.println("Asal    : " + asal);
        System.out.println("Skor    : " + skor);
        System.out.println("--------------------");
    }
}
```
    -Mengubah atriut sebelum nya menjadi atribut peserta lomba

Hasil kode dari praktikum  : 
```java
package minggu14;

public class Node09 {
    PesertaLomba09 data;
    Node09 left, right;

    public Node09 (PesertaLomba09 data) {
        this.data = data;
        left = right = null;
    }
}
```
    -Mengubah data Mahasiswa sebelum nya menjadi Peserta Lomba

Hasil kode dari Praktikum :
```java
package minggu14;

public class BinarySearchTree09 {
     Node09 root;

    public BinarySearchTree09() {
        root = null;
    }

    public void add(PesertaLomba09 data) {
        root = addRekursif(root, data);
    }

    private Node09 addRekursif(Node09 current, PesertaLomba09 data) {
        if (current == null) {
            return new Node09 (data);
        }

        if (data.skor < current.data.skor) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

public void tampilJuara() {
        if (root == null) {
            System.out.println("Data kosong");
            return;
        }

        Node09 current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("=== JUARA ===");
        current.data.tampil();
    }

    public void tampilPenghargaan() {
        System.out.println("=== PESERTA PENERIMA PENGHARGAAN ===");
        tampilPenghargaan(root);
    }

    private void tampilPenghargaan(Node09 node) {
        if (node != null) {
            tampilPenghargaan(node.left);

            if (node.data.skor > 80) {
                node.data.tampil();
            }

            tampilPenghargaan(node.right);
        }
    }

    public int hitungPenerimaPenghargaan() {
        return hitungPenerimaPenghargaan(root);
    }

    private int hitungPenerimaPenghargaan(Node09 node) {
        if (node == null) {
            return 0;
        }

        int jumlah = 0;

        if (node.data.skor >= 80) {
            jumlah = 1;
        }

        return jumlah
                + hitungPenerimaPenghargaan(node.left)
                + hitungPenerimaPenghargaan(node.right);
    }
}
```

    -Menampilkan sebuah "Tampil Juara" "Tampil Penghargaan" dan menghitung penerima penghargaan.

Hasil kode dari Praktikum :
```java
package minggu14;

public class BinarySearchTreeMain09 {
    public static void main(String[] args) {

        BinarySearchTree09 bst = new BinarySearchTree09();

        bst.add(new PesertaLomba09(1, "Andi", "Malang", 75));
        bst.add(new PesertaLomba09(2, "Budi", "Blitar", 90));
        bst.add(new PesertaLomba09(3, "Citra", "Kediri", 85));
        bst.add(new PesertaLomba09(4, "Dina", "Surabaya", 70));
        bst.add(new PesertaLomba09(5, "Eko", "Jember", 95));

        bst.tampilJuara();

        bst.tampilPenghargaan();

        System.out.println("Jumlah penerima penghargaan = "
                + bst.hitungPenerimaPenghargaan());
    }
}
```
    -Menampilkan hasil nya seperti dibawah ini
    
Hasil run dari Praktikum :
```
=== JUARA ===
ID      : 5
Nama    : Eko
Skor    : 95
--------------------
=== PESERTA PENERIMA PENGHARGAAN ===
ID      : 3
Nama    : Citra
Asal    : Kediri
Skor    : 85
--------------------
ID      : 2
Nama    : Budi
Asal    : Blitar
Skor    : 90
--------------------
ID      : 5
Nama    : Eko
Asal    : Jember
Skor    : 95
--------------------
Jumlah penerima penghargaan = 3
```
