package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        Integer base = scan.nextInt();

        System.out.println("Expoente: ");
        Integer expoente = scan.nextInt();

        Integer resultado = 1;

        for(int i = 0; i < expoente;i++){
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
