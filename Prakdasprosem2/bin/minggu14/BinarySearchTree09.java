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