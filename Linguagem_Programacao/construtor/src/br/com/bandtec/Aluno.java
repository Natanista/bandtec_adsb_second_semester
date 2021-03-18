package br.com.bandtec;

public class Aluno {

    private Integer ra;
    private String nome;
    private String curso;
    private Integer faltas;
    private Double notas;

    public Aluno(String nome, String curso, Integer faltas) {
        this.nome = nome;
        this.curso = curso;
        this.faltas = faltas;
    }

    //sobrecarga
    public Aluno(String nome){

    }

    //construtor precisa ter o mesmo noem da classe
    public Aluno(){

    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return String.format("nota:%d, faltas: %s",notas,faltas);
    }
}
