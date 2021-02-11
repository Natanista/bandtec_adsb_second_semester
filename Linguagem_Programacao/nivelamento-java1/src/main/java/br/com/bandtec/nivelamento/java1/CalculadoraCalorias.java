package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class CalculadoraCalorias {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scan.next();

        System.out.print("Quanto tempo voce passa se aquecendo?: ");
        Integer tempo = scan.nextInt();

        System.out.print("Quanto tempo você passou fazendo aerobicos?: ");
        Integer tempoAerobico = scan.nextInt();

        System.out.print("Quanto tempo voce passa fazendo musculacao?: ");
        Integer tempoMusculacao = scan.nextInt();
        Integer totalTempo = tempo + tempoAerobico + tempoMusculacao;
        Integer tempoAquecendo = tempo * 12;
        Integer tempoMusculacao2 = tempo * 25;
        Integer tempoAerobico2 = tempo * 20;
        Integer totalGasto = tempoAerobico2 + tempoAquecendo + tempoMusculacao2;

        String frase = String.format("Olá, %s. Você fez um total de %d minutos de exercicio, e perdeu %d calorias ", name, totalTempo,totalGasto);
        System.out.println(frase);




    }

}
