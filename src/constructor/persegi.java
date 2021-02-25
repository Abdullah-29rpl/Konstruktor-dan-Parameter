/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author apple
 */
public class persegi {
    int sisi;
    int hasil;
    
    void  Segitiga (int sisi){
        this.sisi = sisi;
    }
    
    void hitung(){
        hasil = sisi * sisi;
        System.out.println("Luas segitiga : " +hasil);
    }
    
    //non void
//    int sisi (){
//        return sisi;
//    } 
//    int hitung(){
//        hasil = sisi * sisi;
//        System.out.println("Luas persegi : " +hasil);
//        return hasil;
//    }     
    
}
