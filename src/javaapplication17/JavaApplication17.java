/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ma'al Farhan
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("inputkan nilai (0-100) = ");
        int nilai;
        nilai = a.nextInt();
        
        if(nilai > 100) {
            System.out.println("NILAI MAKSIMAL 100!!!");
        } else if( nilai >= 70)  {
            System.out.println("Selamat ,Anda dinyatakan Lulus");
            System.out.println("------------------------------");
            System.out.println("Orang yang sukses bukanlah orang yang selalu benar/pintar dalam segala hal,");
            System.out.println("tapi orang yang sukses adalah orang yang selalu mencoba kembali ketika ia gagal");
           
        } else {
            System.out.println("Maaf ,Anda dinyatakan Gagal");
            System.out.println("---------------------------");
            System.out.println("Jika gagal coba lagi, Karena kegagalan bukan akhir dari segalanya");
            
        }
    }
    
}
