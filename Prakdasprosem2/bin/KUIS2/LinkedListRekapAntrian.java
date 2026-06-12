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
}
