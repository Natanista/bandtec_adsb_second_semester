/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

/**
 *
 * @author natanista
 */
public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(01202056, "Natan", 9.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.2f",
                aluno1.nome,aluno1.calcularMedia()));
        
        System.out.println(aluno1);
        System.out.println("");
       
        
        
        AlunoPos alunoPos1 = new AlunoPos(9.0, 01202067, "Marquinho Dj", 7.0, 8.0);
        System.out.println(String.format("O aluno de pós graduação %s tem média %.2f", 
                alunoPos1.nome, alunoPos1.calcularMedia()));
        
        System.out.println("");
        System.out.println(alunoPos1);
        
        Faculdade faculdade1 = new Faculdade("BANDTEC", 200);
        
        System.out.println("");
        faculdade1.matricularAluno(aluno1);
     
        System.out.println("");
        faculdade1.matricularAluno(alunoPos1);
        
        System.out.println("");
        faculdade1.exibirAlunosMatriculados();
        
        System.out.println("");
        faculdade1.exibirAlunosPos();
        
        System.out.println("");
        System.out.println(faculdade1);
        
        
  
        
        
        
        
        
       
        
        
        
        
        
    }
}
