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
public class Pedido {

    private String codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Double valorTotal;
    private Double totalPagar;
    private Boolean itemPromocional;

    public Pedido(String codigo, String produto, Integer quantidade, Double valorUnitario, Double valorComDesconto, Double valorTotal, Double totalPagar) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorComDesconto = valorComDesconto;
        this.valorTotal = valorTotal;
        this.totalPagar = totalPagar;
        this.itemPromocional = false;
    }

  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(Double valor){
      this.valorTotal = valor;
    }

    public Boolean getItemPromocional() {
        return itemPromocional;
    }

    public void setItemPromocional(Boolean itemPromocional) {
        this.itemPromocional = itemPromocional;
    }

    public void calcularValorTotal() {
        this.valorTotal = this.valorUnitario * this.quantidade;
  
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public void quebrarLinha(){
        System.out.println("================================================");
            
    }

    @Override
    public String toString() {
        
               quebrarLinha();
       
               return "Pedido:\n" + "Codigo: " + codigo + "\nProduto: " + produto
                    + "\nQuantidade: " + quantidade + "\nValor Unitário: R$"
                    + valorUnitario + "\n Valor total: R$" + valorTotal
                    + "\nValor com desconto: R$" + valorComDesconto + "\nItem promocional: "
                    + itemPromocional + "\n\nTotal a ser pago: R$" + totalPagar;
               
            
             
        

    }

}
