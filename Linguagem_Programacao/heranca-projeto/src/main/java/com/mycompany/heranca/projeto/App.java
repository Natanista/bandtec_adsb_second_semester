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
public class App {
    public static void main(String[] args) {
       VendedorComissao vendedor1 = 
               new VendedorComissao(1,"Natan",25.0,2.0);
       
       VendedorComissaoMaisFixo vendedor2 = 
               new VendedorComissaoMaisFixo(200.0, 10, "Luciano", 200.0, 10.0);
       
       Departamento matriz = new Departamento();
       
       matriz.adicionarVendedor(vendedor1);
       matriz.adicionarVendedor(vendedor2);
       
        System.out.println( matriz.calcularTotalSalario()); 
       matriz.exibirTodos();
       
    }
    
}
