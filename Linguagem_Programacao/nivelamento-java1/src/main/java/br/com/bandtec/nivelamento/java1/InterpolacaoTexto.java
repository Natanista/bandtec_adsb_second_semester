/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java1;

/**
 *
 * @author natanista
 */
public class InterpolacaoTexto {
    public static void main(String[] args) {
            String nome = "Natan";
             Integer idade = 21;
             String frase =  String.format("Nome: %s e idade: %d", nome, idade);
             Integer ano = 2021;
             String ano2 = ano.toString();
             System.out.println(frase + " " + ano);
             
             /*
               %s -> texte
               %d -> inteiros
               %.xf ->reais (x numero de casas decimais)
             
             */
             //quando é 56.69 ele arredonda pra 56.7 caso seja %.x1
             Double preco = 56.9933231213;
             String frasePreco = String.format("O preço é de R$%.1f: ", preco);
             System.out.println(frasePreco);
             
    }
}
