/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

import java.util.Scanner;

/**
 *
 * @author Vira Febrianti
 */
public class GanjilGenap {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menentukan Bilangan Ganjil dan Genap");
        
        System.out.println ("Masukkan Angka : ");
        int angka = input.nextInt();
         
        if (angka % 2 != 0){
            
            System.out.println("Angka : "+ angka + " Bilangan Ganjil ");
            
        }else{
            
            System.out.println("Angka : "+ angka + " Bilangan Genap ");
            
        }
              
    }
    
}
