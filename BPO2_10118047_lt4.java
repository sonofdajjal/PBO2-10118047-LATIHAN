/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpo2_10118047_lt4;

/**
 *
 * @author user
 * Nama         : Abdullah Margani
 * Kelas        : PB02
 * NIM          : 10118047
 * Deskriksi    : 
 * 
 */
public class BPO2_10118047_lt4 {

    public void tambahKambing () {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah;" + jumlahKambing);
    } 
    
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
