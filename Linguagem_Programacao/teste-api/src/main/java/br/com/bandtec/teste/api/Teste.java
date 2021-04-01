/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.teste.api;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;

/**
 *
 * @author natanista
 */
public class Teste {
    
    public static void main(String[] args) {
        Looca looca = new Looca();
        System.out.println(looca.getMemoria());
        gerarQuebraDeLinha();
        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
        gerarQuebraDeLinha();
        System.out.println(looca.getSistema());
        gerarQuebraDeLinha();

        
        System.out.println(looca.getTemperatura());
        
        
        gerarQuebraDeLinha();
        System.out.println(looca.getProcessador());
        gerarQuebraDeLinha();
        System.out.println(looca.getGrupoDeProcessos());






    }

    public static void gerarQuebraDeLinha(){
        System.out.println("------------------------------------");
    }
    
}
