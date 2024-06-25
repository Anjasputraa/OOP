package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Komang Agus Anjas Putra
 * NIM : 2201010760
 * Tanggal : 25 Maret 2024
 */
public class pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
       
       String nama="";
       
       System.out.print("Tuliskan Nama: ");
       try{
            nama = dtIN.readLine();
       }catch(IOException e){
           System.out.println("Terjadi masalah saat mengambil data");
       }
       
       System.out.println("Variabel nama: "+nama);
                
    }
    
}
