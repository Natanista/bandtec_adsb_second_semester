package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer sabor;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Vote na pizza favorita:\n5-Mussarela\n25-Calabresa\n50-Quatro Queijos\nvoto:");
            sabor = scan.nextInt();

            if(sabor == 5){
                mussarela++;
            }else if(sabor == 25){
                calabresa++;
            }else if(sabor== 50){
                quatroQueijos++;
            }

        }
        if(mussarela > calabresa && mussarela > quatroQueijos){
            System.out.println("Mussarela venceu!");
        }else if(calabresa > mussarela && calabresa > quatroQueijos){
            System.out.println("Calabresa venceu!");
        }else if(quatroQueijos > calabresa && calabresa > mussarela){
            System.out.println("Quatro queijos venceu!!");
        }else{
            System.out.println("Aconteceu um empate!");
        }

    }
}
