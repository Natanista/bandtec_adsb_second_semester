package br.com.bandtec.bolo;

public class Bolo {
    String sabor = "";
    Double valor = 0.0;
    Integer quantidadeVendida = 0;

    public void comprarBolo(Integer quantidade){
        if(quantidadeVendida >= 1 && quantidadeVendida <= 100 && quantidade < 100){
            quantidadeVendida += quantidade;
        }else{
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo!");
        }
    }

    public void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f"
                ,sabor,quantidadeVendida,valor * quantidadeVendida));
    }


}
