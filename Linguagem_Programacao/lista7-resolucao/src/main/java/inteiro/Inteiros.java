package inteiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Inteiros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> integerList = new ArrayList<>();

        Integer contador = 0;

        while (contador == 0){
            System.out.println("Digite um número: ");
            Integer numero = scan.nextInt();

            if(numero == 0){
                contador += 1;
            }

            if(numero > 0){
                integerList.add(numero);
            }

        }

        System.out.println("Exibindo apenas os pares da lista: ");
        for(Integer numero : integerList){
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }

        System.out.println("Exibindo ímpares:");
        for(Integer numero : integerList){
            if(numero % 2 != 0){
                System.out.println(numero);
            }
        }

        System.out.println("Exibindo toda lista somada:");
        Integer somaLista = 0;
        for(Integer numero : integerList){
            somaLista += numero;
        }
        System.out.println(somaLista);

        System.out.println("Exibindo o maior da lsita:");
        Integer maiorNumero = Integer.MIN_VALUE;
        for(Integer numero : integerList){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println(maiorNumero);

        System.out.println("Exibindo o menor da lista:");
        Integer menorNumero = Integer.MAX_VALUE;
        for(Integer numero : integerList){
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }
        System.out.println(menorNumero);



    }
}
