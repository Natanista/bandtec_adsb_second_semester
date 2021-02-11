package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu salário bruto: ");
        Double salarioBruto = scan.nextDouble();

        Double descontoInss = salarioBruto * 0.1;
        Double descontoIr = salarioBruto * 0.2;
        Double salarioDescontado = salarioBruto - descontoInss - descontoIr;
        System.out.print("Quanto você gasta de passagem de ida?: ");
        Double passagem = scan.nextDouble();
        Double gastoPassagem = passagem * 2 * 22;
        Double totalDesconto = descontoInss + descontoIr + gastoPassagem;
        Double salarioLiquido = salarioBruto - totalDesconto;

        String frase = String.format("Seu salário bruto é de R$%.2f, tem um total de R$%.2f em descontos" +
                "e receberá um líquido de R$%.2f",salarioBruto,totalDesconto,salarioLiquido);

        System.out.println(frase);
    }

}
