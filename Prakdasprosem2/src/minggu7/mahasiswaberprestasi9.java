package minggu7;

public class mahasiswaberprestasi9 {
    mahasiswa9 [] ListMhs = new mahasiswa9[5];
    int Idx;

    void tambah(mahasiswa9 M){
        if (Idx<ListMhs.length) {
            ListMhs[Idx]=M;
            Idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (mahasiswa9 M:ListMhs){
            M.TampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleshort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            for (int j = 1; j < ListMhs.length-i; j++) {
                if (ListMhs[j].IPK>ListMhs[j-1].IPK) {
                    mahasiswa9 tmp = ListMhs[j];
                    ListMhs[j]=ListMhs[j-1];
                    ListMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionshort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            int IdxMin=i;
            for (int j = i+1; j < ListMhs.length; j++) {
                if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) {
                    IdxMin=j;
                }
            }
            mahasiswa9 Tpm = ListMhs[IdxMin];
            ListMhs[IdxMin] = ListMhs[i];
            ListMhs[i] = Tpm;
        }
    }

    void insertionsort(){
        for (int i = 1; i > ListMhs.length; i++) {
            mahasiswa9 Temp = ListMhs[i];
            int j=i;
            while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
                ListMhs[j] = ListMhs[j - 1];
                j--;
            }
            ListMhs[j] = Temp;
        }
    }
    int  sequentialsearching(double cari){
        int posisi = -1;
        for (int j=0; j<ListMhs.length; j++){
            if (ListMhs[j].IPK==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilposisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos);
        }
        else{
            System.out.println("data" +x+ "tidak ditemukan");
        }
    }
     void tampildatasearch(double x, int pos){
            if (pos!=-1){
                System.out.println("nim\t : " + ListMhs[pos].NIM);
                System.out.println("nama\t : " + ListMhs[pos].Nama);
                System.out.println("kelas\t : " + ListMhs[pos].Kelas);
                System.out.println("ipk\t " +x);
            }
            else{
                System.out.println("data mahasiswa dengan ipk " +x+ "tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid = ( left+right)/2;
            if (cari == ListMhs[mid].IPK){
                return(mid);
            }
            else if (ListMhs[mid].IPK>cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }

        }
        return -1;
    }
}
