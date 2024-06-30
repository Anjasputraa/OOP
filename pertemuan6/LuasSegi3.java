package pertemuan6;

/**
 *
 * Komang Agus Anjas Putra
 * Nim : 2201010760
 * Tanggal : 29 April 2024
 */
public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float Al, float Tg){
        alas = Al;
        tinggi = Tg;
    }
    
    public void setALAS(float nVAL){
        //this.alas = nVAL;
        alas = nVAL;
    }
    public float getALAS(){
         return alas;
    }
    public void setTINGGI(float nVAL){
        tinggi = nVAL;
    }
    public float getTINGGI(){
         return tinggi;
    }
    public void HLuasSegi3(){
        luas = (this.alas*this.tinggi)/2;
    }
    public float getLUAS(){
        return luas;
    }
}
