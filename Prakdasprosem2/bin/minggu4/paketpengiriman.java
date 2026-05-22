package minggu4;

public class paketpengiriman {
     public String nomorResi;
    public double berat;
    public double ongkosDasar;

    public paketpengiriman() {
        
    }

    public paketpengiriman(String nomorResi, double berat, double ongkosDasar) {
        this.nomorResi = nomorResi;
        this.berat = berat;
        this.ongkosDasar = ongkosDasar;
    }

    double hitungOngkos(double totalOngkos) {
        double ongkos = berat * ongkosDasar;
        double potongan = 0;
        if (ongkos > 100000) {
            System.out.println("Anda mendapatkan potongan ongkos sebesar 10%");
            potongan = ongkos / 0.1;
        } 
        totalOngkos = ongkos - potongan;
        return totalOngkos;
    }

    double hitungPresentase() {
        double presentase = 0;
        if (berat > 10) {
            presentase = berat/100;
        }
        return presentase;
    }

    double rataRataOngkos() {
        double rataRata = 0;
        if (berat > 10) {
            rataRata = hitungOngkos(rataRata) / 3;
        }
        System.out.println("Rata - rata ongkos pengiriman : " +rataRata);
        return rataRata;
    }

    void printData() {
        hitungOngkos(berat);
        hitungPresentase();
        rataRataOngkos();
    }

}
