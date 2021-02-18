/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

/**
 *
 * @author natanista
 */
public class ProblemaScanner {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);
        
        String name;
        Integer num1;
        Integer num2;
        Integer num3;
        
  
        System.out.println("Digite as suas 3 notas: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        System.out.println("num1: " + num1 + "\nnum2: " + num2 + "\nnum3: " + num3 );
        
        String fruta1;
        String fruta2;
        String fruta3;
        
         System.out.println("Digite três frutas: ");
         fruta1 = scanText.next();
         fruta2 = scanText.next();
         fruta3 = scanText.next();
         System.out.println("fruta1: " + fruta1 + "\nfruta2: " + fruta2 + "\nfruta3: " + fruta3 );
        
        
        
        
    }
    
}
