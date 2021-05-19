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
public class AlunoPos extends Aluno {
    
    private Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String nome, 
            Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    @Override
    public Double calcularMedia(){
        return (this.notaContinuada + this.notaSemestral + this.notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return String.format("Aluno pós: %s\nNota de monografia: %.2f\n"
                + "Nota Continuada: %.2f\nNota Semestral: %.2f\nMédia: %.2f", 
                super.getNome(),this.notaMonografia,super.notaContinuada,super.notaSemestral,this.calcularMedia());
    }
    
    
    
}
