package KUIS2;

public class LinkedListRekapAntrianMain {
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
