package minggu12;

public class DLLPesanan {
    NodePesanan head;
    NodePesanan tail;
    int size;
    int totalPendapatan;
 
    public DLLPesanan() {
        head = null;
        tail = null;
        size = 0;
        totalPendapatan = 0;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
    // Tambah pesanan di akhir
    public void tambahPesanan(int kodePesanan, String namaPesanan, int harga) {
        Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
        NodePesanan newNode = new NodePesanan(pesanan);
 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        totalPendapatan += harga;
    }
 
    // Sorting manual (Bubble Sort) berdasarkan nama pesanan (ascending)
    private void sortByNama() {
        if (isEmpty() || head == tail) return;
 
        boolean swapped;
        do {
            swapped = false;
            NodePesanan current = head;
            while (current != null && current.next != null) {
                // Bandingkan nama pesanan
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    // Swap data (bukan node)
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
 
    // Laporan pesanan (ditampilkan terurut berdasarkan nama pesanan)
    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
 
        sortByNama(); // sort dulu sebelum tampil
 
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-25s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
 
        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-25s %-10d%n",
                current.data.kodePesanan,
                current.data.namaPesanan,
                current.data.harga);
            current = current.next;
        }
 
        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
        System.out.println("======================================");
    }
 
    public int getSize() {
        return size;
    }
}
