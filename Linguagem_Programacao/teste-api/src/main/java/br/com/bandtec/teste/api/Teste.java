/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.teste.api;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;

/**
 *
 * @author natanista
 */
public class Teste {
    
    public static void main(String[] args) {
        Looca looca = new Looca();
        
        Sistema system = looca.getSistema();
        
        System.out.println(system);
        
        
    }
    
}
