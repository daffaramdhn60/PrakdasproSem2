package minggu7;

public class buku9_CM {
    String kode;
    String judul;
    int tahun;

    buku9_CM(String kode, String judul, int tahun){
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }
    void tampildatabuku(){
        System.out.println(kode + "|" + judul + "|" + tahun);
    }
}
