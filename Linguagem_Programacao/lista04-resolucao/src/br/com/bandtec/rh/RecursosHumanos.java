package br.com.bandtec.rh;

public class RecursosHumanos {

    public static Integer totalColaboradoresPromovidos = 0;
    public static  Integer totalSalariosReajustados = 0;


    public static void reajustarSalario(Colaborador colaborador ,Double valorReajuste){
        totalSalariosReajustados += 1;
        colaborador.salario += valorReajuste;
        System.out.println(String.format("%s teve seu salário reajustado para: R$%.2f",colaborador.nome, colaborador.salario));
    }

    public static void promoverColaborador(Colaborador colaborador, String cargo, Double valor){
       if(valor > colaborador.salario){
           colaborador.cargo = cargo;
           colaborador.salario = valor;
           totalColaboradoresPromovidos += 1;
       }else{
           System.out.println("Operação Inválida!");
       }
        System.out.println(String.format("%s teve seu cargo atualizado para: %s\nNovo salário: R$%.2f",colaborador.nome, colaborador.cargo,colaborador.salario));

    }

    public void exibirTotalColaboradores(){
        System.out.println("Total de colaboradores promovidos: " + totalColaboradoresPromovidos);
    }

    public void exibirTotalReajustados(){
        System.out.println("Total de salarios reajustados: " + totalSalariosReajustados);
    }


}
