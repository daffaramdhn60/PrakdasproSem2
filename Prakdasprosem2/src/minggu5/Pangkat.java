package minggu5;

public class Pangkat {
    
    int nilai;
    int pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBf(int a, int n){
        int hasil =1;
        for(int i =0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n == 0){
            return a;
        }else{
            return a * pangkatDC(a, n-1);
        }
    }
}