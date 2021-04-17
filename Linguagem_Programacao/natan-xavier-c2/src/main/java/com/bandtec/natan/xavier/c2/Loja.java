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
public class Loja {

    private Integer pedidosRealizados;
    private Integer descontosAplicados;

    public Loja() {
        this.pedidosRealizados = 0;
        this.descontosAplicados = 0;
    }

    public Integer getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(Integer pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    public Integer getDescontosAplicados() {
        return descontosAplicados;
    }

    public void setDescontosAplicados(Integer descontosAplicados) {
        this.descontosAplicados = descontosAplicados;
    }

    public void aplicarDesconto(Pedido pedido, Double percentual) {
        Double valorTotal = pedido.getValorTotal();
        Double valorDesconto = valorTotal - (valorTotal * (percentual/100));
        pedido.setValorComDesconto(valorDesconto);
        pedido.setTotalPagar(valorDesconto);
        
        pedido.setItemPromocional(true);
        this.descontosAplicados++;

       
        System.out.println(String.format("Foi aplicado 5 porcento de desconto ao "
                + "pedido de código %s", pedido.getCodigo()));

    }
    
      public void aplicarDesconto(Pedido pedido) {
        Double valorTotal = pedido.getValorTotal();
        Double valorDesconto = valorTotal - (valorTotal * 0.05);
        pedido.setValorComDesconto(valorDesconto);
        pedido.setTotalPagar(valorDesconto);
        
        pedido.setItemPromocional(true);
        this.descontosAplicados++;

       
        System.out.println(String.format("Foi aplicado 5 porcento de desconto ao "
                + "pedido de código %s", pedido.getCodigo()));

    }
    
 
    public void finalizarPedido(Pedido pedido){
        System.out.println(pedido.toString());
        this.pedidosRealizados++;
    }

    @Override
    public String toString() {
        System.out.println("==============================");
        return String.format("\nRELATÓRIO: \n"
                + "Pedidos realizados: %d\n"
                + "Descontos aplicados: %d",
                this.pedidosRealizados,this.descontosAplicados);
    }
    
    

}
