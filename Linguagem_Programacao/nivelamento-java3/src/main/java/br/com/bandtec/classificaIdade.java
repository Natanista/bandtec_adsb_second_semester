package br.com.bandtec;

import java.util.Scanner;

public class classificaIdade {

    public static void classificaIdade(Integer idade){

        if(idade >= 0 && idade <= 2){
            System.out.println("bêbê");
        }else if(idade >= 3 && idade <= 11){
            System.out.println("Criança");
        }else if(idade >= 12 && idade <= 19){
            System.out.println("Adolescente");
        }else if(idade >= 20 && idade <= 30){
            System.out.println("Jovem");
        }else if(idade >= 31 && idade <= 60){
            System.out.println("Adulto");
        }else if(idade > 60){
            System.out.println("Idoso");
        }

    }


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Integer idade = 0;

    do{
        System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

    }while(idade < 0);

    classificaIdade(idade);

    }
}
