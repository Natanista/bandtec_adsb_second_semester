package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class BolsaFilhos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos filhos de 0 a 3 anos você possui?: ");
        Integer qtdFilhos0A3 = scan.nextInt();

        System.out.print("Quantos filhos de 4 a 16 anos você possui?: ");
        Integer qtdFilhos4a16 = scan.nextInt();

        System.out.print("Quantos filhos de 17 a 18 anos você possui?: ");
        Integer qtdFilhos17a18 = scan.nextInt();

        Integer qtdFilhos = qtdFilhos0A3 + qtdFilhos17a18 + qtdFilhos4a16;

        Double bolsa0a3 = qtdFilhos0A3 * 25.12;
        Double bolsa4a16 = qtdFilhos4a16 * 15.88;
        Double bolsa17a18 = qtdFilhos17a18 * 12.44;

        Double totalBolsa = bolsa0a3 + bolsa4a16 + bolsa17a18;

        String frase = String.format("Você tem um total de %d filhos," +
                " e vai receber R$%.2f de bolsa",qtdFilhos,totalBolsa);
        System.out.println(frase);



    }

}
