package br.com.bandtec.calculo;

public class Calculadora {

    public void somar(Double a, Double b){
        Double resultado =  a + b;
        System.out.println(String.format("%.1f + %.1f = %.1f",a,b,resultado));
    }

    public void subtrair(Double a, Double b){
        Double resultado =  a - b;
        System.out.println(String.format("%.1f - %.1f = %.1f",a,b,resultado));
    }

    public void multiplicar(Double a, Double b){
        Double resultado =  a * b;
        System.out.println(String.format("%.1f * %.1f = %.1f",a,b,resultado));
    }

    public void dividir(Double a, Double b){
        Double resultado =  a / b;
        System.out.println(String.format("%.1f / %.1f = %.1f",a,b,resultado));
    }

}
