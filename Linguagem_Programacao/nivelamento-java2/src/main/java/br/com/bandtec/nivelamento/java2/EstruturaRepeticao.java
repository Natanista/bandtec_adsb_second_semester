/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

//        for(int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }

        Scanner scan = new Scanner(System.in);

        Integer numero = 0;
        Boolean flag = false;

        while(!flag){

            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if(numero == 42){
                flag = true;
            }else{
                System.out.println("Numero errado! Tente denovo...");
            }

        }
        System.out.println(numero);

        Integer numerao = Integer.MAX_VALUE;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
        }while(numero != 42);
    }
}
