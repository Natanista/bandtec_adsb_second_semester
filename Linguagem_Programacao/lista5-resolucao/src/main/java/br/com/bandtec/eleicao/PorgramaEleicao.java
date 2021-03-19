package br.com.bandtec.eleicao;

public class PorgramaEleicao {

    public static void main(String[] args) {
        UrnaEletronica urna = new UrnaEletronica();

        urna.comecarEleicao();

        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato2();
        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato2();
        urna.registrarVotoCandidato2();
        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato2();
        urna.registrarVotoCandidato1();
        urna.registrarVotoCandidato2();
        urna.registrarVotoCandidato2();

        urna.encerrarEleicao();
    }
}
