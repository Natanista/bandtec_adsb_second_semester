/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java1;

/**
 *
 * @author natanista
 */
public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Double saldo = 200.0;
        
        Double totalPassagens = saldo / 4.40;
        
        Integer totalPassagensInteiro =  totalPassagens.intValue();
        
        System.out.println("passagens considerando 4 por dia: " + (totalPassagensInteiro/4));
        
    }
}
