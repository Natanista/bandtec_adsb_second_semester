/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.bancodedados;

/**
 *
 * @author natanista
 */
public class Filme {
    
   private String nome;
   private String tema;
   private Integer ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", tema=" + tema + ", ano=" + ano + '}';
    }
    
    
   
   
    
}
