package br.com.bandtec.nivelamento.java2;

public class NumerosPares {
    public static void main(String[] args) {
        Integer contador = 0;
        while(contador < 40){
            if(contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
