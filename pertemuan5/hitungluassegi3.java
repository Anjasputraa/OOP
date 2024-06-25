package pertemuan5;

/**
 *
 * @Komang Agus Anjas Putra
 * nim : 2201010760
 * tanggal : 26 april 2024
 */
public class hitungluassegi3 {
    double Alas, Tinggi, Luas;
    
    void setAlas(double Nilai){
        Alas = Nilai;
    }
    void setTinggi (double Nilai){
        Tinggi = Nilai;
    }
    double getAlas(){
        return Alas;
    }
    double getTinggi(){
        return Tinggi;
    }
    double HitungLsegi3(){
        Luas = (Alas * Tinggi) / 2;
        return Luas;  
    }
    void TampilHasil(){
        System.out.println("Hitung Luas Segitiga");
        System.out.println("====================");
        System.out.println("Nilai Alas      : "+Alas);
        System.out.println("Nilai Tinggi    : "+Tinggi);
        System.out.println("Nilai Luas      : ");
        System.out.println("Luas = Alas*Tinggi/2);");
        System.out.println("    = "+Alas+"*"+Tinggi+"/2");
        System.out.println("    = "+Luas);
    }
}
