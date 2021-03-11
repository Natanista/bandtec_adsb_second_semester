package br.com.bandtec.rh;

public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador();
        Colaborador colaborador2 = new Colaborador();

        colaborador1.salario = 3000.00;
        colaborador1.nome = "Natan";
        colaborador1.cargo = "Analista";

        RecursosHumanos rh1 = new RecursosHumanos();

        rh1.promoverColaborador(colaborador1,"Gerente",49000.00);
        rh1.promoverColaborador(colaborador1,"empacotador",232000.00);
        rh1.promoverColaborador(colaborador1,"empacotador",2556000.00);


        rh1.reajustarSalario(colaborador1,7000.00);
        rh1.reajustarSalario(colaborador1,7000.00);
        rh1.reajustarSalario(colaborador1,7000.00);
        rh1.reajustarSalario(colaborador1,7000.00);
        rh1.reajustarSalario(colaborador1,7000.00);
        rh1.reajustarSalario(colaborador1,7000.00);

        rh1.exibirTotalReajustados();
        rh1.exibirTotalColaboradores();
    }
}
