package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        Boolean flag = false;

        while(!flag){
            System.out.print("LOGIN: ");
            String login = scan.next();

            System.out.print("Senha: ");
            String senha = scan.next();

            if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("#Bandtec")){
                flag = true;
                System.out.println("Login efetuado com sucesso!");
            }else{
                System.out.println("Login e/ou senha inválidos!");
            }
        }
    }
}
