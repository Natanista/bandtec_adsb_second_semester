/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.heranca.projeto;
        
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natanista
 */
public class Departamento {
    private final List<VendedorComissao> vendedores;
    

    public Departamento() {
        this.vendedores = new ArrayList<>();
    }
    
    
    
    public void adicionarVendedor(VendedorComissao v){
        vendedores.add(v);
    }
    
    public Double calcularTotalSalario(){
        Double totalSalarios = 0.0;
        for(VendedorComissao vendedor : vendedores){
            totalSalarios += vendedor.calcularSalario();
        }
        return totalSalarios;
}
    
    public void exibirTodos(){
        for(VendedorComissao vendedor : vendedores){
            System.out.println(vendedor);
        }
    }
    
    
    
    
}


