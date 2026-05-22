package minggu12;

public class DoubleLinkedList {
        Node09 head;
        Node09 tail;
    
        public DoubleLinkedList() {
            head = null;
            tail = null;
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        // tambah depan
        public void addFirst(Mahasiswa09 data) {
            Node09 newNode = new Node09(null, data, null);
    
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
    
        // tambah belakang
        public void addLast(Mahasiswa09 data) {
            Node09 newNode = new Node09(null, data, null);
    
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    
        // insert setelah nim tertentu
        public void insertAfter(String keyNim, Mahasiswa09 data) {
            Node09 current = head;
    
            while (current != null) {
                if (current.data.nim.equals(keyNim)) {
    
                    Node09 newNode = new Node09(current, data, current.next);
    
                    if (current.next != null) {
                        current.next.prev = newNode;
                    } else {
                        tail = newNode;
                    }
    
                    current.next = newNode;
                    return;
                }
    
                current = current.next;
            }
    
            System.out.println("Data tidak ditemukan");
        }
    
        // print
        public void print() {
    
            if (isEmpty()) {
                System.out.println("Linked List masih kosong");
                return;
            }
    
            Node09 current = head;
    
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    
        // print reverse
        public void printReverse() {
    
            if (isEmpty()) {
                System.out.println("Linked List masih kosong");
                return;
            }
    
            Node09 current = tail;
    
            while (current != null) {
                current.data.tampil();
                current = current.prev;
            }
        }
    
        // hapus depan
        public void removeFirst() {
    
            if (isEmpty()) {
                System.out.println("Linked List kosong");
                return;
            }
    
            System.out.println("Data yang dihapus:");
            head.data.tampil();
    
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    
        // hapus belakang
        public void removeLast() {
    
            if (isEmpty()) {
                System.out.println("Linked List kosong");
                return;
            }
    
            System.out.println("Data yang dihapus:");
            tail.data.tampil();
    
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }



