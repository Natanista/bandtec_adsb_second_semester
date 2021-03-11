package br.com.bandtec.emprego;

public class TesteEmpregado {

    public static void main(String[] args) {

    Empregado empregado1 = new Empregado();
    empregado1.cargo = "Analista de sistemas";
    empregado1.salario = 5400.00;
    empregado1.imprimirReajuste(15.0);



    }
}
