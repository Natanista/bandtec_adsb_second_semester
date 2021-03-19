package br.com.bandtec.eleicao;

public class UrnaEletronica {
    private Integer candidato1 = 0;
    private Integer candidato2 = 0;
    private Integer totalVotacao = 0;
    private Integer qtdVotoDaSessão = 0;

    public void comecarEleicao(){
        System.out.println("Começou a eleição!");
        quebrarLinha();
    }

    private void zerarVotos(){
        candidato1 = 0;
        candidato2 = 0;
        totalVotacao = 0;
        qtdVotoDaSessão = 0;
    }

    private void quebrarLinha(){
        System.out.println("");
    }

    private void quebrarLinhaComEstilo(){
        System.out.println("----------------------------------");
    }

    public void registrarVotoCandidato1(){
        totalVotacao++;
        candidato1 += 1;
        System.out.println(String.format("Candidato1 recebeu 1 voto, totalizando %d",candidato1));

        qtdVotoDaSessão++;

        if(qtdVotoDaSessão == 2){
            qtdVotoDaSessão = 0;
            System.out.println(String.format("Total de votos: %d",totalVotacao));
            quebrarLinha();
        }
    }

    public void registrarVotoCandidato2(){


        qtdVotoDaSessão++;
        totalVotacao++;
        candidato2 += 1;
        System.out.println(String.format("Candidato 2 recebeu 1 voto, totalizando %d",candidato2));


        if(qtdVotoDaSessão == 2){
            qtdVotoDaSessão = 0;
            System.out.println(String.format("Total de votos: %d",totalVotacao));
            quebrarLinha();
        }


    }

    private String verificarVencedor(Integer a, Integer b){
        String vencedor = "";
        if(a > b){
            vencedor = "candidato 1 venceu";
        }else{
            vencedor = "candidato 2 venceu";
        }

        return vencedor;
    }

    public void encerrarEleicao(){

        quebrarLinha();
        System.out.println("Eleição encerrada!!");
        quebrarLinhaComEstilo();
        System.out.println(String.format("Total de votos: %d",totalVotacao));
        System.out.println(String.format("Resultado: %s",verificarVencedor(candidato1,candidato2)));
        zerarVotos();
    }


}
