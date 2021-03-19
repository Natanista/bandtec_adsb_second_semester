package br.com.bandtec.futebol;
public class Clube {

    private Integer vitoria = 0;
    private Integer empate = 0;
    private Integer derrota = 0;
    private Integer pontos = 0;
    private String nome = "";



    public Clube(String nome,int i, int i1, int i2) {
        this.nome = nome;
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;
        this.pontos = (vitoria * 3) + (empate * 1);
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public Integer getEmpate() {
        return empate;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public Integer getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    void registrarVitoria(){
        this.vitoria += 1;
        this.pontos += 3;
    }

    void registrarEmpate(){
        this.vitoria += 1;
        this.pontos += 1;
    }

    void registrarDerrota(){
        this.vitoria += 1;
    }

}
