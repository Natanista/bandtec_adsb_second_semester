package br.com.bandtec;

import java.util.Scanner;

public class Exemplo1 {

    static void gerarEspaco() {
        System.out.println("==========================");
    }

    static Integer somar(Integer a, Integer b){
        return a + b;
    }

    static String isOdd(Integer a){
        if(a % 2 == 0){
            return "par";
        }else{
            return "impar";
        }
    }

    static void exibeLinha(){
        System.out.println("*********************************");
    }

    static void exibeNomeAsteristico(String nome){
        exibeLinha();
        System.out.println(nome);
        exibeLinha();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    /*
        System.out.println("Natan");

       gerarEspaco();

        System.out.println("Xavier");

        gerarEspaco();

        System.out.println("Hello World");

        gerarEspaco();

        System.out.println(isOdd(somar(2,3)));
    */

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        exibeNomeAsteristico(nome);

    }
}
