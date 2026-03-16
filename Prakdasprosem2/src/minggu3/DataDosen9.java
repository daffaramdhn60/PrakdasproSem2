package minggu3;

public class DataDosen9 {
     public void dataSemuaDosen(Dosen9[] arrOfDosen) {
        for (int i = 0; i < arrOfDosen.length; i++) {
            arrOfDosen[i].cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen9[] arrOfDosen) {
        int lk = 0, pr = 0;

        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].jenisKelamin) {
                lk++;
            } else {
                pr++;
            }
        }
        System.out.println("Jumlah dosen laki - laki : " + lk + " orang");
        System.out.println("Jumlah dosen perempuan : " + pr + " orang");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen9[] arrOfDosen) {
        int totalLk = 0, totalPr = 0, lk = 0, pr = 0;

        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].jenisKelamin) {
                totalLk += arrOfDosen[i].usia;
                lk++;
            } else {
                totalPr += arrOfDosen[i].usia;
                pr++;
            }
        }
        System.out.println("Rata - rata usia dosen laki - laki : " +(totalLk/lk));
        System.out.println("Rata - rata usia dosen perempuan : " +(totalPr/pr));
    }

    void infoDosenPalingMuda(Dosen9[] arrOfDosen) {
        Dosen9 termuda = arrOfDosen[0];
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].usia < termuda.usia) {
                termuda = arrOfDosen[i];
            }
        }
        System.out.println("--- Dosen Paling Muda ---");
        termuda.cetakInfo();
    }

    void infoDosenPalingTua(Dosen9[] arrOfDosen) {
        Dosen9 tertua = arrOfDosen[0];
        for (int i = 0; i < arrOfDosen.length; i++) {
            if (arrOfDosen[i].usia > tertua.usia) {
                tertua = arrOfDosen[i];
            }
        }
        System.out.println("--- Dosen Paling Tua ---");
        tertua.cetakInfo();
    }
}