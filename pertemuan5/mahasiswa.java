package pertemuan5;

/**
 *
 * @Komang Agus Anjas Putra
 * nim : 2201010760
 * tanggal : 26 april 2024
 */
public class mahasiswa {
    
    private String nim, nama;
    
    public mahasiswa(String vnim, String vnama){
        nim = vnim;
        nama = vnama;
    }
    
    public void setNIM(String vnim){
        nim = vnim;
    }
    public void setNAMA(String vnama){
        nama = vnama;
    }
        String getNIM(){
        return nim;
    }
        String getNAMA(){
        return nama;
    }
        void TampilHasil(){
        System.out.println("Mahasiswa");
        System.out.println("=========");
        System.out.println("Nim     : "+nim);
        System.out.println("Nama    : "+nama);
}

    void setNim(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}