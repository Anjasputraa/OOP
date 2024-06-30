package pertemuan7;

/**
 *
 * Komang Agus Anjas Putra
 * nim: 2201010760
 * tanggal: 6 mei 2024
 */
public class induk1 {
    private String nama;
    public int nilai = 0;
    
    public induk1(String nm, int nl){
        nama = nm;
        nilai = nl;
    }
    
    public void setNama(String nVAL){
        this.nama = nVAL;
    }
    
    public void setNama(){
        this.nama = "saya siapa?";
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void cetakNama(){
        System.out.printf("isi variabel nama: %s\n dengan tinggi badan %d \n", this.nama, this.nilai);
    }
}
