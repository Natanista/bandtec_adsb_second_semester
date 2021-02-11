package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scan.next();

        System.out.print("Senha: ");
        String senha = scan.next();

        System.out.print("Quantas vezes você aceita errar?: ");
        Integer qtdVezes = scan.nextInt();

        String frase = String.format("Seu login é %s e a senha é %s. Você tem %d tentativas " +
                "antes da sua conta bloquear",login,senha,qtdVezes);

        System.out.println(frase);

    }

}
