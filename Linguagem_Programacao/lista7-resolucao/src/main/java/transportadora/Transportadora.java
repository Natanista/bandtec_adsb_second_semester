package transportadora;

public class Transportadora {

    private String nome;
    private Integer envios;
    private Double faturamento;



    public Transportadora(String nome) {
        this.nome = nome;
        this.envios = 0;
        this.faturamento = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnvios() {
        return envios;
    }

    public void setEnvios(Integer envios) {
        this.envios = envios;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    private void gerarQuebraDeLinha(){
        System.out.println("----------------------------------");
    }

    private Double calcularValorDimensao(Encomenda encomenda){
        Double valorDimensao = 0.0;
        Double largura = encomenda.getLargura();
        Double altura = encomenda.getAltura();
        Double precoEncomenda = encomenda.getValorDaEncomenda();


        if(altura < 50 && largura > 15){
            valorDimensao = precoEncomenda * 0.1;
        }else if(altura <= 15 && altura > 6 && largura <= 50 && largura > 16 ){
            valorDimensao = precoEncomenda * 0.3;
        }else if(altura <= 6 && largura <= 16){
            valorDimensao = precoEncomenda * 0.5;
        }

        return  valorDimensao;
    }

    private Double calcularValorDistancia(Encomenda encomenda){
        Double distancia = encomenda.getDistancia();
        Double valorDistancia = 0.0;

        if(distancia > 200){
            valorDistancia = 7.0;
        }else if(distancia <= 200 && distancia > 50){
            valorDistancia = 5.0;
        }else if(distancia <= 50){
            valorDistancia = 3.0;
        }

        return valorDistancia;
    }

    public Double calcularFrete(Encomenda encomenda){
        Double valorDimensao = calcularValorDimensao(encomenda);
        Double valorDistancia = calcularValorDistancia(encomenda);

        Double valorFrete = valorDimensao + valorDistancia;

        return valorFrete;
    }

    private void emitirEtiqueta(Encomenda encomenda){

        System.out.println("****** ETIQUETA PARA ENVIO *******");
        System.out.println(String.format("Endereço do remetente: %s", encomenda.getEndereco()));
        System.out.println(String.format("Endereço do destinatário: %s",encomenda.getDestinatario()));
        System.out.println(String.format("Altura da encomenda: %.1f cm",encomenda.getAltura()));
        System.out.println(String.format("Largura da encomenda: %.1f cm",encomenda.getLargura()));
        gerarQuebraDeLinha();
        System.out.println(String.format("Valor da encomenda: R$%.2f",encomenda.getValorDaEncomenda()));
        System.out.println(String.format("Valor do frete: R$%.2f",calcularValorDimensao(encomenda)));
        gerarQuebraDeLinha();
        System.out.println(String.format("Valor total: R$%.2f",(encomenda.getValorDaEncomenda()+calcularFrete(encomenda))));
    }

    public void enviar(Encomenda encomenda){
        if(encomenda.getStatus()){
            System.out.println("Encomenda ja foi enviada!");
        }else{
            encomenda.setStatus(true);
            this.envios ++;
            this.faturamento += calcularFrete(encomenda);
            emitirEtiqueta(encomenda);

        }
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "nome='" + nome + '\'' +
                ", envios=" + envios +
                ", faturamento=" + faturamento +
                '}';
    }
}
