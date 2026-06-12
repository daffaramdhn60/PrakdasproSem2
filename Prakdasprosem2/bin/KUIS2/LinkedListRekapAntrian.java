package KUIS2;

public class LinkedListRekapAntrian {
    NodeRekapAntrian head;

    public LinkedListRekapAntrian() {
        head = null;
    }

    public  void tambahAntrian(int jamAntri) {
        NodeRekapAntrian current = head;

        while (current != null) {
            if (current.jamAntri == jamAntri) {
                current.jumlah++;
                return;
            }
            current = current.next;
    }
}
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
    public void tampilJamTerbanyak() {
         if (head == null) {
            System.out.println("data kosong");
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
