package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer numero = 0;
        Integer pares = 0;
        Integer impares = 0;

        do{
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scan.nextInt();
        }while(numero < 0 || numero > 100);

        for(int i = 0; i <= 200; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
            if(numeroAleatorio % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            if(numeroAleatorio == numero){
                System.out.println("Número sorteado na posição: " + i);
            }
        }

        System.out.println("Números pares sorteados: " + pares);
        System.out.println("Números impares sorteados: " + impares);

    }
}
