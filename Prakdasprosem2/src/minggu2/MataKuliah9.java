package minggu2;

public class MataKuliah9 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah9(){

    }

    public MataKuliah9(String kodeMk, String nm, int sks,int jmljam){
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmljam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }

    void ubahSks(int sksbaru){
        sks = sksbaru;
        System.out.println("SKS telah berhasil diubah!");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if(jumlahJam > jam){
            jumlahJam -= jam;
        }else{
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jam tidak mencukupi");
        }
    }
}
