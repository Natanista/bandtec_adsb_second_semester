package br.com.bandtec;

public class App {
    public static void main(String[] args) {
        //instancia = objeto criado a partir de uma forma
        ContaCorrente conta1 = new ContaCorrente();
        conta1.saldo = 200.20;
        conta1.titular = "Natan";

        ContaCorrente conta2 = new ContaCorrente();
        conta2.saldo = 200.2;
        conta2.titular = "Nei";

        System.out.println(conta1.titular);
        System.out.println(conta2.titular);

        conta1.depositar(200.0);



        conta1.sacar(900.0);
        System.out.println(conta1.saldo);
    }
}
