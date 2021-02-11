package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o limite de peso do elevador?: ");
        Double limitePeso = scan.nextDouble();

        System.out.print("Qual o limite de pessoas no elevador?: ");
        Integer limitePessoas = scan.nextInt();

        System.out.print("Digite o peso da 1º pessoa a entrar no elevador: ");
        Double peso1 = scan.nextDouble();

        System.out.print("Digite o peso da 2º pessoa a entrar no elevador: ");
        Double peso2 = scan.nextDouble();

        System.out.print("Digite o peso da 3º pessoa a entrar no elevador: ");
        Double peso3 = scan.nextDouble();

        Double pesoTotal = peso1 + peso2 + peso3;

        String frase = String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas." +
                "\nO peso total do elevador é de: %.2f, sendo que ele suporta %.2f",
                limitePessoas, pesoTotal, limitePeso);
        System.out.println(frase);

    }

}
