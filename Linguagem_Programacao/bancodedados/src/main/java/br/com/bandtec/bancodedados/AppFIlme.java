/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.bancodedados;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author natanista
 */
public class AppFIlme {
    public static void main(String[] args) {
        //Objeto que possui as config de conexao com o BD
        Conexao con = new Conexao();
        
        //Assistente para executar comandos no BD
        JdbcTemplate template = new JdbcTemplate(con.getBanco());
        
        //criando tabela

//template.execute("CREATE TABLE filme(id INT PRIMARY KEY AUTO_INCREMENT, nome VARCHAR(255), tema VARCHAR(255), ano INT)");

////atualiza dados
//        template.update("INSERT INTO filme VALUES (null,?,?,?)","Liga da Justiça","Ação",2020); ;
////      
      List resultados = template.queryForList("SELECT * FROM filme");
////        
   System.out.println(resultados);
   
   List<Filme> filmes = template.query("SELECT * FROM filme", new BeanPropertyRowMapper(Filme.class));
        for(Filme filme : filmes) {
            System.out.println(filme.toString());
        }
        
    }
}
