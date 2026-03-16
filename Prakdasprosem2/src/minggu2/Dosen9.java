package minggu2;

public class Dosen9 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangkeahlian;

    public Dosen9(){

    }
    
    public Dosen9(String idDosen, String nm, boolean statusAktif, int tahunBergabung, String bidangkeahlian){
        this.idDosen = idDosen;
        nama = nm;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangkeahlian = bidangkeahlian;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen   : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        if (statusAktif){
            System.out.println("Status Dosen : Aktif");
        }else{
            System.out.println("Status Dosen : Tidak Aktif");
        }

        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangkeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunSkrng){
        int masaKerja = tahunSkrng - tahunBergabung;
        System.out.println("Masa Kerja Dosen : " + masaKerja + "tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangkeahlian = bidang;
    }
}
