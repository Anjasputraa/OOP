package pertemuan4;

import java.util.Scanner;

/**
 *
 * @Komang Agus Anjas Putra
 * nim : 2201010760
 * tanggal : 22 april 2024
 */
public class ArrayDim {
    int jdata = 5;
    String[] dteman = new String[jdata];
    Scanner dtIN = new Scanner(System.in);
    
   public void storedata(){
       
       System.out.println("isikan Data Teman");
       System.out.println("~~~~~~~~~~~~~~~~~");
       
       int num=0;
       for(int i=0; i<jdata;i++){
            num++;
            
       System.out.print("Data ke-"+num+": ");
       dteman[i] = dtIN.nextLine(); 
       
       /**          
 *     System.out.print("Data ke-2: ");
       dteman[1] = dtIN.nextLine(); 
       System.out.print("Data ke-3: ");
       dteman[2] = dtIN.nextLine(); 
       System.out.print("Data ke-4: ");
       dteman[3] = dtIN.nextLine(); 
       System.out.print("Data ke-5: ");
       dteman[4] = dtIN.nextLine(); 
       */ 
       
       }
  
   }
   
   public void viewdata(){
       System.out.println("Daftar Teman");
       System.out.println("~~~~~~~~~~~~");
       
       int no=0;
       for(int i=0; i<jdata; i++){
           no++;
           
           System.out.println(no+". "+dteman[i]);
       }
   }
   public void editdata(){
       System.out.println("Ubah Data Teman");
       System.out.println("~~~~~~~~~~~~~~~");
       System.out.print("Index Data yang di Ubah: ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);
       
       System.out.println("Data yang di Ubah: "+dteman[idx]);
       System.out.print("Di ubah menjadi: ");
       String newdt = dtIN.nextLine();
       dteman[idx] = newdt;
       System.out.println("data index ke-"+idx+" telah diubah");

   }
   
   public void destroydata(){
       System.out.println("Hapus Data Teman");
       System.out.println("~~~~~~~~~~~~~~~~");
       System.out.print("Index Data yang di Hapus: ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);  
       dteman[idx]="";
       
       System.out.println("Data index ke-"+idx+" telah di hapus");
   }
   
}

