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
public class VendedorComissaoMaisFixo extends VendedorComissao {
    
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salario, Integer codigo, String nome, Double vendas, Double taxas) {
        super(codigo, nome, vendas, taxas);
        this.salarioFixo = salario ;
    }
    
    @Override
    public Double calcularSalario(){
         return this.salarioFixo += super.calcularSalario();
    }
    
    
}
