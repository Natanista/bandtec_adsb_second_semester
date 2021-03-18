package br.com.bandtec;

public class ContaCorrente {

    private String cliente = "";
    private Double saldo = 0.0;
    private String situacao = verificarSituacaoFinanceira();

    public void sacar50(){
       if((this.saldo - 50) < 0){
           System.out.println("Operação negada! Saldo indisponível!");
       }else{
           this.saldo -= 50;
           System.out.println("Saque efetuado com sucesso");
       }
    }

    public void depositar50(){
        if((this.saldo + 50) > 200){
            System.out.println("valor limite de 200 reais atingido!");
        }else{
            this.saldo += 50;
            System.out.println("Depósito efetuado com sucesso!");
        }
    }

    public Double getSaldo() {
        return this.saldo;
    }

    private String verificarSituacaoFinanceira(){
        if (this.saldo > 100){
            situacao = "Razoável";
        }else{
            situacao = "Ta gastando muito";
        }
        return situacao;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
