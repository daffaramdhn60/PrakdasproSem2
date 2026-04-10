package minggu6;

public class datadosen9 {

    dosen9[] DataDosen = new dosen9[10];
    int Idx;

    void Tambah(dosen9 dsn) {
        if (Idx < DataDosen.length) {
            DataDosen[Idx] = dsn;
            Idx++;
        } else {
            System.out.println("Data Penuh");
        }
    }

    void Tampil() {
        for (int i = 0; i < Idx; i++) {
            DataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < Idx - 1; i++) {
            for (int j = 0; j < Idx - i - 1; j++) {
                if (DataDosen[j].Usia > DataDosen[j + 1].Usia) {
                    dosen9 tmp = DataDosen[j];
                    DataDosen[j] = DataDosen[j + 1];
                    DataDosen[j + 1] = tmp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < Idx; i++) {
            int Max = i;
            for (int j = i + 1; j < Idx; j++) {
                if (DataDosen[j].Usia > DataDosen[Max].Usia) {
                    Max = j;
                }
            }
            dosen9 Tmp = DataDosen[Max];
            DataDosen[Max] = DataDosen[i];
            DataDosen[i] = Tmp;
        }
    }
}
