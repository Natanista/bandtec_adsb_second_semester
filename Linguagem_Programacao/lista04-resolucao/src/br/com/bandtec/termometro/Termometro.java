package br.com.bandtec.termometro;

public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    public void aumentarTemperatura(Double temperatura){
        if(temperaturaAtual + temperatura > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }else{
            temperaturaAtual += temperatura;
        }

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    public void diminuirTemperatura(Double temperatura){
        if(temperaturaAtual - temperatura < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        }else{
            temperaturaAtual -= temperatura;
        }

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    public void exibirFahreinheit(){
        Double temperaturaFahreinheit = (temperaturaAtual * (9/5)) + 32;
        System.out.println(String.format("Temperatura em Fahreinheint: %.2fº",temperaturaFahreinheit));
    }



}
