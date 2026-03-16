package minggu3;

public class Dosen9 {
      String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen9 (String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void cetakInfo() {
        System.out.println("Kode : " +kode);
        System.out.println("Nama : " +nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita")); 
        System.out.println("Usia : " +usia);
        System.out.println("---------------------------------------");  
    }
}
