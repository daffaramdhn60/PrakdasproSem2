package minggu2;

public class DosenMain9 {

        Dosen9 dsn1 = new Dosen9();
        dsn1.idDosen = "254786";
        dsn1.nama = "Bu Mina";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2012;
        dsn1. bidangkeahlian = "Biologi";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Biologi Murni");
        dsn1.tampilkanInformasi();

        Dosen9 dsn2 = new Dosen9("254334", "Bu Beta", true, 2005, "Fisika");
        dsn2.tampilkanInformasi();
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Kimia");

        Dosen9 dsn3 = new Dosen9("254776", "Pak Fendi", false, 2002, "Sejarah");
        dsn3.tampilkanInformasi();
        dsn3.setStatusAktif(true);
        dsn3.hitungMasaKerja(2025);
}