package pertemuan7;

/**
 *
 * Komang Agus Anjas Putra
 * nim: 2201010760
 * tanggal: 6 mei 2024
 */
public class pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk1 a2 = new induk1("Agus",0);
        turunan01 al = new turunan01();
        //induk1 al = new induk1();
        
        System.out.println("1. Isi dari variabel nama : "+al.getNama());
        
        al.setNama("Komang Agus Anjas Putra");
        System.out.println("2. isi dari variabel nama : "+al.getNama());
        
        al.setNama();
        System.out.println("3. isi dari variabel nama : "+al.getNama());
        
        al.cetakNama();
        a2.cetakNama();
    }
    
}
