package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean flag = false;
        Integer vezes = 0;
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 11);
        
        while (!flag) {
            
            System.out.print("Digite um número de 1 a 10: ");
            Integer numero = scan.nextInt();

            if (numeroAleatorio == numero) {
               
                System.out.println(numeroAleatorio);
                flag = true;
                
                if (vezes > 10) {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                    
                } else if (vezes >= 4 && vezes <= 10) {
                    System.out.println("Você é sortudo");
                    
                } else if (vezes <= 3) {
                    System.out.println("Você é MUITO sortudo");
                    
                }
            } else if (numero > 10 || numero < 1) {
                System.out.println("Número inválido!");
                
            } else {
                vezes++;
                System.out.println("Erooou!");
                
            }
        }
        
        System.out.println("Número sorteado: " + numeroAleatorio);

    }
}
