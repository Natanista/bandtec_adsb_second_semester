package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        String fraseNome = String.format("Olá %s. Qual o ano do seu Nascimento?: ", nome);

        System.out.print(fraseNome);
        Integer ano = scan.nextInt();
        Integer idade = 2030 - ano;
        String fraseIdade = String.format("Em 2030 você tera %d anos", idade);

        System.out.println(fraseIdade);

    }
}
