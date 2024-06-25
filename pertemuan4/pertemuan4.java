package pertemuan4;

import java.util.Scanner;
/**
 *
 * @Komang Agus Anjas Putra
 * nim : 2201010760
 * tanggal : 22 april 2024
 */
public class pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDim AD = new ArrayDim();
        Scanner dIN = new Scanner(System.in);
        String bubar = "TIDAK";
        
        /**
        AD.storedata();
        AD.viewdata();
        AD.editdata(); 
    
        AD.destroydata();
        AD.viewdata();
        /*
        */
        do {
                System.out.println("Aplikasi Buku Teman V1.0");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("A. Isi Data");
                System.out.println("B. Tampil Data");
                System.out.println("C. Ubah Data");
                System.out.println("D. Hapus Data");
                System.out.println("S. Selesai");
                System.out.print("Pilih menu: ");

                String ch = dIN.nextLine();
                switch (ch) {
                    case "A":
                        AD.storedata();
                        break;

                    case "B":
                        AD.viewdata();
                        break;

                    case "C":
                        AD.editdata();
                        break;

                    case "D":
                        AD.destroydata();
                        break;

                    case "S":
                        bubar = "YA";
                        break;

                    default:
                        System.out.println("Menu Pilihan tidak Difenisikan");
                        break;
                }
            }while (bubar.equals("TIDAK"));
    }
    
}
