package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: ");
        Double valorUnitario = scan.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        Integer qtdVendida = scan.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        Double valorPago = scan.nextDouble();

        Double calculoTroco = valorPago - (valorUnitario * qtdVendida);

        String fraseTroco = String.format("O troco será de : R$%.2f",calculoTroco);
        System.out.println(fraseTroco);

    }

}
