package KUIS2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
 
    Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
}

class NodeRekapAntrian {
    int jamAntri;
    int jumlah;
    NodeRekapAntrian next;

    public NodeRekapAntrian(int jamAntri, int jumlah) {
        this.jamAntri = jamAntri;
        this.jumlah = jumlah;
        this.next = null;
    }
}

class LinkedListRekapAntrian {
    NodeRekapAntrian head;

    public LinkedListRekapAntrian() {
        head = null;
    }

    // Tambah atau update jam antrian
    public void tambahAntrian(int jamAntri) {
        NodeRekapAntrian current = head;

        while (current != null) {
            if (current.jamAntri == jamAntri) {
                current.jumlah++;
                return;
            }
            current = current.next;
        }

        NodeRekapAntrian newNode = new NodeRekapAntrian(jamAntri, 1);

        if (head == null) {
            head = newNode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Menampilkan seluruh rekap
    public void tampilRekap() {
        NodeRekapAntrian current = head;

        System.out.println("Rekap Antrian per Jam:");
        while (current != null) {
            System.out.println(
                "Jam " + current.jamAntri +
                " : " + current.jumlah + " antrian"
            );
            current = current.next;
        }
    }

    // Menampilkan jam dengan antrian terbanyak
    public void tampilJamTerbanyak() {
        if (head == null) {
            System.out.println("Data kosong");
            return;
        }

        NodeRekapAntrian max = head;
        NodeRekapAntrian current = head.next;

        while (current != null) {
            if (current.jumlah > max.jumlah) {
                max = current;
            }
            current = current.next;
        }

        System.out.println("\nJam dengan antrian terbanyak:");
        System.out.println(
            "Jam " + max.jamAntri +
            " dengan " + max.jumlah + " antrian"
        );
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListRekapAntrian rekap = new LinkedListRekapAntrian();

        rekap.tambahAntrian(11);
        rekap.tambahAntrian(12);
        rekap.tambahAntrian(11);
        rekap.tambahAntrian(13);
        rekap.tambahAntrian(11);
        rekap.tambahAntrian(12);

        rekap.tampilRekap();
        rekap.tampilJamTerbanyak();
    }
}
