package minggu10;

public class AntrianKRS {
     Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahProses = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        } else {
            System.out.println("Memproses 2 mahasiswa");
            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();

                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
            if (size == 0) {
                front = rear = -1;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Terdepan : ");
            data[front].tampilkanData();
            if (size > 1) {
                data[(front + 1) % max].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Paling Akhir : ");
            data[rear].tampilkanData();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahProses() {
        return sudahProses;
    }

    public int belumProses() {
        int belum = 30 - sudahProses;
        return belum;
    }
}
