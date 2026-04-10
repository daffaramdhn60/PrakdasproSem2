package minggu7;

public class peminjaman9_CM {
    mahasiswa9_CM mhs; 
    buku9_CM buku;     
    int lamaPinjam;
    int denda;

    peminjaman9_CM(mahasiswa9_CM mhs, buku9_CM buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int telat = lamaPinjam - batas;

        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampildatapeminjaman() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
