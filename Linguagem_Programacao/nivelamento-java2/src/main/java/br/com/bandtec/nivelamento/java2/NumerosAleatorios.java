package br.com.bandtec.nivelamento.java2;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Boolean flag = false;

        while (!flag) {
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 100);
            if(numeroAleatorio == 100){
                System.out.println(numeroAleatorio);
            }
        }

    }
}
