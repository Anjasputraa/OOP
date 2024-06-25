package pertemuan5;

/**
 *
 * @Komang Agus Anjas Putra
 * nim : 2201010760
 * tanggal : 26 april 2024
 */
public class pertemuan5 {

    private static String komang;
    private static String Anjas;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        aritmatika Amatik = new aritmatika();
        int hsltambah = 0;
        
        hsltambah = Amatik.tambah(3,5);
        System.out.println("Hasil: "+hsltambah);
        
        hitungluassegi3 HSL3 = new hitungluassegi3();
        HSL3.setAlas(5);
        HSL3.setTinggi(8);
        double hsl = HSL3.HitungLsegi3();
        HSL3.TampilHasil();
        
        mahasiswa mhs = new mahasiswa("2201010760","Komang Agus Anjas Putra");
        mhs.TampilHasil();
        
    }
    
}
