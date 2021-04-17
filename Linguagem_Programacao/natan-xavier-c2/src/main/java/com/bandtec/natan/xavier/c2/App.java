/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bandtec.natan.xavier.c2;

/**
 *
 * @author natanista
 */
public class App {
    
    
    public static void main(String[] args) {
        
        Pedido pedido1 = new Pedido("001", "tenis", 1, 220.0, 220.0, 220.0, 220.0);
        Pedido pedido2 = new Pedido("002", "shorts", 3, 100.0, 100.0, 100.0, 100.0);
        Pedido pedido3 = new Pedido("003", "bermuda", 5, 80.0, 80.0, 80.0, 80.0);
      
        
        pedido1.calcularValorTotal();
        pedido2.calcularValorTotal();
        pedido3.calcularValorTotal();
     
        
        Loja loja = new Loja();
        
        loja.aplicarDesconto(pedido2,10.0);
        loja.aplicarDesconto(pedido3);
        
       
            
        loja.finalizarPedido(pedido1);
        loja.finalizarPedido(pedido2);
        loja.finalizarPedido(pedido3);

        System.out.println(loja.toString());
       
    }
}
