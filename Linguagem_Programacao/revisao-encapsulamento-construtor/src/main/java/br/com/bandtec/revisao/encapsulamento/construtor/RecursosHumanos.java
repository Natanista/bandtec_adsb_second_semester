/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.revisao.encapsulamento.construtor;

/**
 *
 * @author natanista
 */
public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalReajustes;
    
    
    public void reajustarSalario(Colaborador colaborador,Double valorReajuste){
        
            Double salarioAtual = colaborador.getSalario();
            Double valorReajustado = salarioAtual * (valorReajuste * 100);
            colaborador.setSalario(salarioAtual + valorReajustado);
            totalReajustes++;
    }    
    
    public void promoverColaborador(Colaborador colaborador, 
            String novoCargo, Double novoSalario){
             
        novoSalario = 0.0;
              if(colaborador.getSalario() < novoSalario){
                  colaborador.setSalario(novoSalario);
                  colaborador.setCargo(novoCargo);
              }else{
                    System.out.println("Operação inválida!");
              }
    }   
        
      
}
     
        
    

