package KUIS2;

public class DLLAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int size;
    int nomorUrut; 
 
    public DLLAntrian() {
        head = null;
        tail = null;
        size = 0;
        nomorUrut = 0;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
    public void tambahAntrian(String namaPembeli, String noHp) {
        nomorUrut++;
        Pembeli pembeli = new Pembeli(nomorUrut, namaPembeli, noHp);
        NodeAntrian newNode = new NodeAntrian(pembeli);
 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorUrut);
    }
 
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-20s %-15s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %-15s%n",
                current.data.noAntrian,
                current.data.namaPembeli,
                current.data.noHp);
            current = current.next;
        }
    }
 
    public Pembeli hapusAntrian(int noAntrian) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
 
        NodeAntrian current = head;
        while (current != null && current.data.noAntrian != noAntrian) {
            current = current.next;
        }
 
        if (current == null) {
            System.out.println("Nomor antrian " + noAntrian + " tidak ditemukan.");
            return null;
        }
 
        Pembeli pembeli = current.data;
 
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return pembeli;
    }
 
    public int getSize() {
        return size;
    }
}
