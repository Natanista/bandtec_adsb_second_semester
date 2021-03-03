package br.com.bandtec;

import java.util.Scanner;

public class ClasseSocial {

    public static Double rendaPorSalarioMinimo(Double valor){
        return valor / 1100;
    }

    public static String identificarClasse(Double valor) {
    String classeSocial = "";
        if (valor <= 2) {
            classeSocial =  "E";
        } else if (valor > 2 && valor <= 4) {
            classeSocial =  "D";
        } else if (valor > 4 && valor <= 10) {
            classeSocial = "C";
        } else if (valor > 10 && valor <= 20) {
            classeSocial = "B";
        } else if (valor > 20) {
            classeSocial = "A";
        }

        return  classeSocial;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double salario = 0.0;

        do{
            System.out.println("Entre com sua renda: ");
            salario = scan.nextDouble();

        }while(salario < 0);

       Double salariosMinimos = rendaPorSalarioMinimo(salario);

       String classeSocial = identificarClasse(salariosMinimos);


        System.out.println(String.format("Você recebe aproximadamente %.2f salários mínimos.",salariosMinimos));
        System.out.println(String.format("Você pertence a classe social: %s",classeSocial));


    }
}
