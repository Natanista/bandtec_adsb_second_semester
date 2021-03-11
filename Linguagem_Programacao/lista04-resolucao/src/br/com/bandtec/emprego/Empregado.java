package br.com.bandtec.emprego;

public class Empregado {
    String nome;
    String cargo;
    Double salario;

    public Double reajustarSalario(Double porcentagemReajuste){
        salario += (salario / 100) * porcentagemReajuste;
        return salario;

    }

    public void imprimirReajuste(Double valorReajuste){
        Double salarioReajustado = reajustarSalario(valorReajuste);

        System.out.println(String.format("Nome: %s\nCargo: %s\nsalário reajustado: R$%.2f",
                nome,cargo,salarioReajustado));
    }

}
