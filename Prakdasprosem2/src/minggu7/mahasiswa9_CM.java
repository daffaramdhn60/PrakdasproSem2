package minggu7;

import java.util.Scanner;

public class mahasiswa9_CM {
    String nim,nama,prodi;

    mahasiswa9_CM(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilprodimahasiswa(){
        System.out.println(nim +  "|" + nama + "|" + prodi);
    }
}
