package pertemuan6;

import java.util.Scanner;
/**
 *
 * Komang Agus Anjas Putra
 * Nim : 2201010760
 * Tanggal : 29 April 2024
 */
public class pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("Nilai Alas: ");
        float nAlas = dIN.nextFloat();
        
        System.out.print("Nilai Tinggi: ");
        float nTinggi = dIN.nextFloat();
        
        LuasSegi3 LS = new LuasSegi3(nAlas, nTinggi);
        
        //LS.setALAS(71);
        //LS.setTINGGI(86 );
        LS.HLuasSegi3();
        
        System.out.println("Nilai ALas      : "+LS.getALAS() );
        System.out.println("nilai tinggi    : "+LS.getTINGGI() );
        System.out.println("==================================");
        System.out.println("Jadi Luas Segitiga: ");
        System.out.println("Luas    = ½ X Alas X Tinggi");
        System.out.println("Luas    = ½ X "+ LS.getALAS()+" X "+LS.getTINGGI() );
        System.out.println("        = " + LS.getLUAS() );
        
        System.out.println("COMPLICATION ERROR!");
    }
    
}
