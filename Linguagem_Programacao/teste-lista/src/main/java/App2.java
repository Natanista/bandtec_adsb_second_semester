
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natanista
 */
public class App2 {
    
    public static void main(String[] args) {
        
        List<String> bandas = new ArrayList();
        
        bandas.add("Nirvana");
        bandas.add("Ultrage a Rigor");
        bandas.add("Capital Inicial");
        bandas.add("Engenheiros");
        bandas.add("RHCP");
        
        for(int i = 0; i < bandas.size(); i++){
        
            System.out.println("banda" + bandas.get(i));
        }
        
        System.out.println("Fiiltrando bandas: 2");
        for(int i = 0; i < bandas.size(); i++){
            if(bandas.get(i).contains("2")){
                System.out.println(bandas.get(i));
            }
           
        }
        
         System.out.println("Fiiltrando bandas: banda favorita ");
        for(int i = 0; i < bandas.size(); i++){
            
            if(bandas.get(i).equals("Nirvana")){
                System.out.println("achei a banda favorita: " + bandas.get(i));
            }
        }
          
         System.out.println("Deletando banda");;
        for(int i = 0; i < bandas.size(); i++){
            
            if(bandas.get(i).equals("Nirvana")){
                System.out.println("achei a banda favorita: " + bandas.get(i));
            }
            
            if(bandas.get(i).contains("ana")){
                bandas.remove(i);
            }
        }
        
        System.out.println(bandas);
        
        for(String banda : bandas){
            System.out.println(banda);
        }
        
        List<Integer> numeros = new ArrayList();
        
        numeros.add(20);
        numeros.add(12);
        numeros.add(11);
        
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        
        
        List<Aluno> alunos = new ArrayList();
        
        Aluno a1 = new Aluno(1, "Jorge");
        Aluno a2 = new Aluno(2, "Marco");
        Aluno a3 = new Aluno(3, "Jonas");
          
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
        
        alunos.forEach(alunoDavez -> {
            System.out.println(alunoDavez.getNome() + "  é daora");
        });
        
    }
    
}
