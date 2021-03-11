package br.com.bandtec.encomenda;

public class App {

    public static void main(String[] args) {

        Encomenda arara = new Encomenda();
        arara.altura = 135.00;
        arara.largura = 90.00;
        arara.enderecoRemetente = "Rua giuliana, 900";
        arara.enderecoDestinatario = "Rua Haddock Lobo, 595";
        arara.distancia = 10.0;
        arara.valorEncomenda = 10.0;

        arara.emitirEtiqueta();


    }
}
