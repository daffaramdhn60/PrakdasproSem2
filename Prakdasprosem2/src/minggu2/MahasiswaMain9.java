package minggu2;

public class MahasiswaMain9 {
    public static void main(String[] args) {
        Mahasiswa9 mhs1 = new Mahasiswa9();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa9 mhs2 = new Mahasiswa9("Annisa nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa9 mhsJace = new Mahasiswa9("Jace", "12345678", 3.80, "TM 2B");
        mhsJace.tampilkanInformasi();
    }
}