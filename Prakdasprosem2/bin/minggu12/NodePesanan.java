package minggu12;

public class NodePesanan {
    Pesanan data;
    NodePesanan prev;
    NodePesanan next;
 
    public NodePesanan(Pesanan data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class PesertaLomba {
    int idPeserta;
    String nama;
    String asal;
    int skor;

    public PesertaLomba(int idPeserta, String nama, String asal, int skor) {
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

public class Node {
    PesertaLomba data;
    Node left, right;

    public Node(PesertaLomba data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(PesertaLomba data) {
        root = addRekursif(root, data);
    }

    private Node addRekursif(Node current, PesertaLomba data) {
        if (current == null) {
            return new Node(data);
        }

        if (data.skor < current.data.skor) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    // Menampilkan juara (skor tertinggi)
    public void tampilJuara() {
        if (root == null) {
            System.out.println("Data kosong");
            return;
        }

        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("=== JUARA ===");
        current.data.tampil();
    }

    // Menampilkan peserta dengan skor > 80
    public void tampilPenghargaan() {
        System.out.println("=== PESERTA PENERIMA PENGHARGAAN ===");
        tampilPenghargaan(root);
    }

    private void tampilPenghargaan(Node node) {
        if (node != null) {
            tampilPenghargaan(node.left);

            if (node.data.skor > 80) {
                node.data.tampil();
            }

            tampilPenghargaan(node.right);
        }
    }

    // Menghitung jumlah peserta skor >= 80
    public int hitungPenerimaPenghargaan() {
        return hitungPenerimaPenghargaan(root);
    }

    private int hitungPenerimaPenghargaan(Node node) {
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

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(new PesertaLomba(1, "Andi", "Malang", 75));
        bst.add(new PesertaLomba(2, "Budi", "Blitar", 90));
        bst.add(new PesertaLomba(3, "Citra", "Kediri", 85));
        bst.add(new PesertaLomba(4, "Dina", "Surabaya", 70));
        bst.add(new PesertaLomba(5, "Eko", "Jember", 95));

        bst.tampilJuara();

        bst.tampilPenghargaan();

        System.out.println("Jumlah penerima penghargaan = "
                + bst.hitungPenerimaPenghargaan());
    }
}