package minggu12;

import minggu10.Mahasiswa;

public class Node09 {
    Mahasiswa data;
    Node09 prev;
    Node09 next;

    public Node09(Node09 prev, Mahasiswa data, Node09 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
