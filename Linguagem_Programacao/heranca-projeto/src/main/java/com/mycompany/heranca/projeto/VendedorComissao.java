/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.heranca.projeto;

/**
 *
 * @author natanista
 */
public class VendedorComissao {
    
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxas;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxas) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxas = taxas / 100;
    }
    
    public Double calcularSalario(){
        return vendas * taxas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }

    @Override
    public String toString() {
        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxas=" + taxas + '}';
    }
    
    
    
}
