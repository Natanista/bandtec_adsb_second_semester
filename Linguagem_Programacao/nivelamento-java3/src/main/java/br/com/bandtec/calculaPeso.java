package br.com.bandtec;

import java.util.Scanner;

public class calculaPeso {

    public static void calculaPeso(String sexo, Double altura){
        Double pesoIdeal = 0.0;
        if(sexo.equalsIgnoreCase("M")){
            pesoIdeal = (72.2 * altura) - 58;
        }else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println(String.format("Seu peso ideal é de : %.2fkg",pesoIdeal));

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo = "";
        Double altura = 0.0;

        Boolean flag = false;

        while(!flag){
            System.out.println("Digite o sexo(M ou F):");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                flag = true;
            }

        }

        do{
            System.out.println("Digite sua altura: ");
            altura = scan.nextDouble();
        }while(altura < 0);


        calculaPeso(sexo,altura);



    }
}
