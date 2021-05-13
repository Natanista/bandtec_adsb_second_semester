/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.heranca;

/**
 *
 * @author natanista
 */
public class Aluno {
    private String nome;
    private String ra;
    private Integer semestre;
    private Boolean ativo;

    public Aluno(String nome, String ra, Integer semestre, Boolean ativo) {
        this.nome = nome;
        this.ra = ra;
        this.semestre = semestre;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", semestre=" + semestre + ", ativo=" + ativo + '}';
    }
    
    
    
}
