package pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author Komang Agus Anjas Putra
 * NIM : 2201010760
 * Tanggal : 25 Maret 2024
 */
public class msgbox1 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Tulis Nama");
        
        System.out.println("Isi Variabel nama: "+nama);
    }
}

