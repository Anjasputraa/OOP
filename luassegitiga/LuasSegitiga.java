package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author komang Agus Anjas Putra
 * NIM : 2201010760
 * Tanggal : 4 april 2024
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        
        Number luas;
        int a = 0;
        int t = 0;
        String nilai = "";
        
        System.out.println("Hitung Luas Segitiga");
        System.out.println("--------------------");
        
        System.out.print("Masukkan Alas Segitiga: ");
        nilai = dtain.nextLine();
        a = Integer.parseInt(nilai);
        
        System.out.print("Masukkan Tinggi Segitiga: ");
        nilai = dtain.nextLine();
        t = Integer.parseInt(nilai);
        
        luas = a * t;
       
        System.out.println("Luas Segitiga adalah: "+luas);
    }
    
}
