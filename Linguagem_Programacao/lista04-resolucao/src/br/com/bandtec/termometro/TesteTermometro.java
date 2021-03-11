package br.com.bandtec.termometro;

public class TesteTermometro {

    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        termometro.temperaturaAtual = 20.0;
        termometro.temperaturaMax= 42.0;
        termometro.temperaturaMin = 33.0;

        termometro.aumentarTemperatura(90.0);
        termometro.diminuirTemperatura(90.0);
        termometro.diminuirTemperatura(2.0);
        termometro.aumentarTemperatura(2.0);
        termometro.exibirFahreinheit();
    }
}
