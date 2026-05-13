public class StackSurat09 {
     Surat09[] stack;
    int top;
    int size;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat09 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Mohon maaf tidak bisa menambah surat lagi!");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            Surat09 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat yang diproses.");
            return null;
        }
    }

    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat izin ditemukan");
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat izin tidak ditemukan");
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMahasiswa + "\t" + 
            stack[i].kelas + "\t" + stack[i].jenisIzin + "\t\t" + stack[i].durasi);
        }
        System.out.println("");
    }
}
