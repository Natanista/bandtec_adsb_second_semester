package br.com.bandtec.encomenda;

public class Encomenda {

    Double altura;
    Double largura;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    String tamanho;
    Double valorFrete;
    Double valorDistancia;
    Double taxaDeFrete;

    public Double estipularPrecoDistancia(Double distancia){
        if(distancia  <= 50){
            valorDistancia = 3.0;

        }else if(distancia > 50 && distancia <=200){
            valorDistancia = 5.0;

        }else{
            valorDistancia = 7.0;
        }

        return valorDistancia;
    }

    public String definirTamanhoPacote(Double altura, Double largura){
        if(altura <= 6 && largura <= 16){
            tamanho = "Pequeno";

        }else if(altura >= 7 && altura <= 15 && largura >=17 && largura <=50){
            tamanho = "Médio";

        }else{
            tamanho = "Grande";

        }

        return tamanho;
    }

    public Double calcularTaxaFrete(Double valorEncomenda){
        String tamanhoPacote = definirTamanhoPacote(altura, largura);
        if(tamanhoPacote.equalsIgnoreCase("Pequeno")){
            taxaDeFrete = (valorEncomenda/100) * 1;

        }else if(tamanho.equalsIgnoreCase("Médio")){
            taxaDeFrete = (valorEncomenda/100) * 3;

        }else{
            taxaDeFrete = (valorEncomenda/100) * 5;
        }

        return taxaDeFrete;

    }

    public Double calcularFrete(){
        Double precoDistancia = estipularPrecoDistancia(distancia);
        Double taxaFrete = calcularTaxaFrete(valorEncomenda);

        valorFrete = taxaFrete + precoDistancia;

        return valorFrete;

    }

    public void gerarLinha(){
        System.out.println("-----------------------");
    }

    public void emitirEtiqueta(){
        Double valorFrete = calcularFrete();

        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println(String.format("Endereço do remetente: %s\nEndereço do destinatário: %s\nAltura da encomenda: %.2f cm\nLargura da encomenda: %.2f cm"
                ,enderecoRemetente,enderecoDestinatario,altura,largura));

        gerarLinha();

        System.out.println(String.format("Valor da encomenda: R$%.2f\nValor do Frete: R$%.2f"
                ,valorEncomenda,valorFrete));

        gerarLinha();

        System.out.println(String.format("Valor total: R$%.2f",valorEncomenda + valorFrete));


    }

}
