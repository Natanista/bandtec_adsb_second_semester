package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite a nota 1: ");
        Double nota1 = scan.nextDouble();

        System.out.print("Digite a nota 2: ");
        Double nota2 = scan.nextDouble();

        Double media = (nota1 + nota2) / 2;
        String frase = String.format("%s, a sua media ficou em: %.2f",nome, media);
        System.out.println(frase);

    }

}
