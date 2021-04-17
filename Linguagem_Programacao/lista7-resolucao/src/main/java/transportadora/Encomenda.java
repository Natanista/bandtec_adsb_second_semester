package transportadora;

public class Encomenda {

    private Double altura;
    private Double largura;
    private String endereco;
    private String destinatario;
    private Double distancia;
    private Double valorDaEncomenda;
    private Boolean isSend;



    public Encomenda(Double altura, Double largura, String endereco, String destinatario, Double distancia, Double valorDaEncomenda) {
        this.altura = altura;
        this.largura = largura;
        this.endereco = endereco;
        this.destinatario = destinatario;
        this.distancia = distancia;
        this.valorDaEncomenda = valorDaEncomenda;
        this.isSend = false;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorDaEncomenda() {
        return valorDaEncomenda;
    }

    public void setValorDaEncomenda(Double valorDaEncomenda) {
        this.valorDaEncomenda = valorDaEncomenda;
    }

    public Boolean getStatus() {
        return isSend;
    }

    public void setStatus(Boolean send) {
        isSend = send;
    }
}
