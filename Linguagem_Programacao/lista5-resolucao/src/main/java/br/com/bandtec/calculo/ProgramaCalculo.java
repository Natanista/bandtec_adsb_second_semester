package br.com.bandtec.calculo;

public class ProgramaCalculo {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.subtrair(10.0,2.0);
        calculadora.somar(10.0,2.0);
        calculadora.dividir(10.0,2.0);
        calculadora.multiplicar(10.0,2.0);

    }
}
