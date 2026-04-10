package minggu6;

public class dosen9 {
    
    String Kode, Nama;
    boolean JenisKelamin;
    int Usia;

    public dosen9(String KD, String Name, boolean JK, int AGE) {
        Kode = KD;
        Nama = Name;
        JenisKelamin = JK;
        Usia = AGE;
    }

     void tampil() {
        String JK = JenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println(Kode + " | " + Nama + " | " + JK + " | " + Usia);
    }
}
