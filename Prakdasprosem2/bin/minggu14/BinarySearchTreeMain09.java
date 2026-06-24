package minggu14;

public class BinarySearchTreeMain09 {
    public static void main(String[] args) {

        BinarySearchTree09 bst = new BinarySearchTree09();

        bst.add(new PesertaLomba09(1, "Andi", "Malang", 75));
        bst.add(new PesertaLomba09(2, "Budi", "Blitar", 90));
        bst.add(new PesertaLomba09(3, "Citra", "Kediri", 85));
        bst.add(new PesertaLomba09(4, "Dina", "Surabaya", 70));
        bst.add(new PesertaLomba09(5, "Eko", "Jember", 95));

        bst.tampilJuara();

        bst.tampilPenghargaan();

        System.out.println("Jumlah penerima penghargaan = "
                + bst.hitungPenerimaPenghargaan());
    }
}
