/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.teste.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natanista
 */public class App {
    
    public static void main(String[] args) {
        
//        List listaLoka = new ArrayList();      
//        listaLoka.add("Natan");
//        listaLoka.add(21);
//        listaLoka.add(1.72);
//        
//        System.out.println(listaLoka);

List<String> nomes = new ArrayList();
nomes.add("primeiro");
nomes.add("segundo");
nomes.add(0, "terceiro");
nomes.set(0, "terceiro");


        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());
        
        System.out.println(nomes);
    }
    
}
