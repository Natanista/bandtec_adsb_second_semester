/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.bancodedados;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author natanista
 */
public class Conexao {

    private BasicDataSource banco;

    public Conexao() {
        this.banco = new BasicDataSource();
        banco.setDriverClassName("org.h2.Driver");
        banco.setUrl("jdbc:h2:file:./meu-banco");
        banco.setUsername("sa");
        banco.setPassword("");
    }

    public BasicDataSource getBanco() {
        return banco;
    }
    
    
    
    

}
