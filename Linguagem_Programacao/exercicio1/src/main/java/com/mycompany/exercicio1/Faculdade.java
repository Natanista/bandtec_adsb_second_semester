/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

import java.util.List;
import com.mycompany.exercicio1.AlunoPos;
import java.util.ArrayList;

/**
 *
 * @author natanista
 */
public class Faculdade {
    
    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
    public void matricularAluno(Aluno a){
        
        if(this.listaAlunos.size() < vagas){
        this.listaAlunos.add(a);
            System.out.println(String.format(
                    "ALuno: %s cadastrado com sucesso na faculdade %s",
                    a.nome,this.nome)
            );
        }else{
            System.out.println(String.format(
                    "A faculdade %s não tem mais vagas!",
                    this.nome));
        }
    }
    
    public void exibirAlunosMatriculados(){
        System.out.println("Exibindo Alunos matriculados:");
        if(this.listaAlunos.size() >= 1){
        for(Aluno a : listaAlunos){
            System.out.println(a);
        }
        }else{
            System.out.println(String.format(
                    "A faculdade %s não possui alunos cadastrados",
                    this.nome));
        }
        
    }
    
    public void exibirAlunosPos(){
        System.out.println("Exibindo alunos de pós graduação");
        if(!this.listaAlunos.isEmpty()){
        for(Aluno a: listaAlunos){
            if(a instanceof AlunoPos){
            System.out.println(a);
            }else{
            System.out.println(String.format(
                    "A faculdade %s não possui alunos de pós graduação cadastrados",
                    this.nome));
            }
        }
        }else{
            System.out.println(String.format(
                    "A faculdade %s não possui alunos cadastrados",
                    this.nome));
        }
        
    }

    @Override
    public String toString() {
        return String.format("Faculdade: %s\nVagas: %d\nAlunos: %s",
                this.nome,this.vagas,this.listaAlunos);
        
    }
    
    
}
