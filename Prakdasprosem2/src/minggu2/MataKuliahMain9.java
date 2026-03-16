package minggu2;

public class MataKuliahMain9 {
    public static void main(String[] args) {
        MataKuliah9 mk1 = new MataKuliah9();
        mk1.kodeMk = "25617";
        mk1.nama = "Bahasa Inggris";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();
        
    }
}
