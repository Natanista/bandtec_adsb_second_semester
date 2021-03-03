package br.com.bandtec;

import java.util.Scanner;

public class DescontoProgressivo {

    public static Double calcularDesconto(Double valor, Integer quantidade){
        Double valorTotal = valor * quantidade;
        Double percentualDesconto = 0.0;
        if(quantidade == 1){
            percentualDesconto = 10.0;
        }else if(quantidade == 2){
            percentualDesconto = 20.0;
        }else if(quantidade >= 3){
            percentualDesconto = 30.0;
        }

        Double desconto = percentualDesconto * (valorTotal / 100);
        return valorTotal - desconto;
    }

    public static void notaFiscal(Double valorProduto, Integer qtdProdutos){
        System.out.println(String.format("Valor do produto: R$%.2f\nQuantidade: %d\nValor com desconto: R$ %.2f",valorProduto
                ,qtdProdutos,calcularDesconto(valorProduto, qtdProdutos)));
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Double valorProduto = 0.0;
    Integer qtdProdutos = 0;

    do{
        System.out.println("Digite o valor do produto: ");
        valorProduto = scan.nextDouble();

    }while(valorProduto < 0);

        do{
            System.out.println("Digite a quantidade de produtos: ");
            qtdProdutos = scan.nextInt();

        }while(valorProduto < 0);


    notaFiscal(valorProduto,qtdProdutos);


    }
}
