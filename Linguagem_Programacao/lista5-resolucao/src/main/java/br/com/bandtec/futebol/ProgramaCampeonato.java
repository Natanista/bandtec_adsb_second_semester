package br.com.bandtec.futebol;

import java.util.concurrent.ThreadLocalRandom;

public class ProgramaCampeonato {

    static void quebrarLinha(){
        System.out.println("-----------------------------------------------");
    }

    static void apurarResultados(Clube a, Clube b, Integer rodadas){

        for(int i = 0; i < rodadas; i++){
            Integer resultado = ThreadLocalRandom.current().nextInt(1,4);
            if(resultado == 1){
                System.out.println(resultado);
                a.registrarVitoria();
                b.registrarDerrota();
                System.out.println(String.format("%s ganhou essa rodada!",a.getNome()));
                System.out.println(String.format("%s perdeu essa rodada!",b.getNome()));
                System.out.println(String.format("%s  pontos: %d",a.getNome(),a.getPontos()));
                System.out.println(String.format("%s pontos: %d ",b.getNome(),b.getPontos()));
                quebrarLinha();
            }else if(resultado == 2){
                System.out.println(resultado);
                a.registrarDerrota();
                b.registrarVitoria();
                System.out.println(String.format("%s ganhou essa rodada!",b.getNome()));
                System.out.println(String.format("%s perdeu essa rodada!",a.getNome()));
                System.out.println(String.format("%s  pontos: %d",b.getNome(),b.getPontos()));
                System.out.println(String.format("%s pontos: %d ",a.getNome(),a.getPontos()));
                quebrarLinha();
            }else{
                System.out.println(resultado);
                a.registrarEmpate();
                b.registrarEmpate();
                a.registrarDerrota();
                b.registrarVitoria();
                System.out.println(String.format("%s empatou essa rodada!",b.getNome()));
                System.out.println(String.format("%s empatou essa rodada!",a.getNome()));
                System.out.println(String.format("%s  pontos: %d",b.getNome(),b.getPontos()));
                System.out.println(String.format("%s ",a.getNome(),a.getPontos()));
                quebrarLinha();
            }


        }

        quebrarLinha();

    }

    static void finalizarTemporada(Clube a, Clube b){
        System.out.println("Final de temporada");

        System.out.println(String.format("%s: %d vitórias, %d derrotas, %d empates.\nTotal de pontos: %d",
                a.getNome(),a.getVitoria(),a.getDerrota(),a.getEmpate(),a.getPontos()));

        System.out.println(String.format("%s: %d vitórias, %d derrotas, %d empates.\nTotal de pontos: %d",
                b.getNome(),b.getVitoria(),b.getDerrota(),b.getEmpate(),b.getPontos()));
    }

    public static void main(String[] args) {

        Clube barcelona = new Clube("barcelona",1,1,1);
        Clube saoPaulo = new Clube("são paulo",1,1,1);

        apurarResultados(barcelona,saoPaulo,5);
       finalizarTemporada(barcelona,saoPaulo);
    }

}

