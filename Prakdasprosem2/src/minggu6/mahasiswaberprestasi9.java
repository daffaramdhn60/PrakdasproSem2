package minggu6;

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
}