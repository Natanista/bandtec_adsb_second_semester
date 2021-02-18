package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer numero;
        Integer soma = 0;

        do{
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            soma += numero;
        }while(numero != 0);

        System.out.println("soma total: " + soma);



    }
}
