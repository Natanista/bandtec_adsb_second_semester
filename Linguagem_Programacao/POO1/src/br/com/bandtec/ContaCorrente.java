package br.com.bandtec;

public class ContaCorrente {

    //Atributo
    String titular;
    Double saldo = 0.0;

    void depositar(Double quantia){
        saldo += quantia;
    }

    void sacar(Double quantia){
        if(saldo - quantia >= 0){
            saldo -= quantia;
        }else{
            System.out.println("Saldo indisponível!!");
        }
    }

}
