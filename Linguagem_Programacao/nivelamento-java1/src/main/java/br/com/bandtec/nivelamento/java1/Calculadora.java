package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        Double real1 = scan.nextDouble();

        System.out.println("Digite outro número real:");
        Double real2 = scan.nextDouble();

        Double soma = real1 + real2;
        String fraseSoma = String.format("O resultado da soma: %.2f",soma);
        Double subtracao = real1 - real2;
        String fraseSubtracao = String.format("O resultado da subtracao é de: %.2f", subtracao);
        Double divisao = real1 / real2;
        String fraseDivisao = String.format("O resultado da divisão é: %.2f",divisao );
        Double multiplicacao = real1 * real2;
        String fraseMultiplicacao = String.format("O resultado da multiplicacao: %.2f", multiplicacao);

        System.out.println(fraseSoma);
        System.out.println(fraseSubtracao);
        System.out.println(fraseMultiplicacao);
        System.out.println(fraseDivisao);



    }

}
