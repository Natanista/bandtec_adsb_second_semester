package br.com.bandtec;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exemplo2 {

    static Double calcularMedia(Double num1, Double num2){
        return (num1 + num2) / 2;
    }
    
      static Double calcularMedia(Double num1, Double num2, Double num3){
        return (num1 + num2) / 2;
    }
    
    

    static void verificarResultado(Double media){

        if(media >= 6){
            System.out.println(String.format("%.2f - Aprovado",media));

        }else{
            System.out.println(String.format("%.2f - Reprovado",media));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = scan.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        Double nota3 = scan.nextDouble();

         verificarResultado(calcularMedia(nota1,nota2,nota3));
         

    }
}
