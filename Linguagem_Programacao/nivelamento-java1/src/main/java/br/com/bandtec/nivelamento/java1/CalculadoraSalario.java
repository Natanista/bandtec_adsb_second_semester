package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        Double salario = scan.nextDouble();

        System.out.print("Quanto de imposto você deve pagar?: ");
        Double imposto = scan.nextDouble();

        Double valor = salario * (imposto/100);

        String frase = String.format("Você devera pagar: %.2f",valor);

        System.out.println(frase);
    }
}
