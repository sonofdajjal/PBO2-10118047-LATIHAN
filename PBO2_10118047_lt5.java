/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_lt5;

/**
 *
 * @author user
 * Nama         : Abdullah Margani
 * Kelas        : PB02
 * NIM          : 10118047
 * Deskriksi    : 
 */
public class PBO2_10118047_lt5 {

   int jumlahKambing = 88;
   
   //method menampilkan jumlah kambing
   public void getJumlahKambing(){
       System.out.println("Jumlah Kambing: " + jumlahKambing);
   }
   public void tambahKambing(){
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
