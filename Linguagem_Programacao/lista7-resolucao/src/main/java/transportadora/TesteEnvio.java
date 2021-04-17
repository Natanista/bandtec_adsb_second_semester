package transportadora;

public class TesteEnvio {

    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda(20.0,10.0,"Rua feijuada, 214","Isabely",100.0,400.0);
        Encomenda encomenda2 = new Encomenda(50.0,30.0,"Rua cuzcuz, 666","Meireles",50.0,20.0);

        Transportadora transportadora = new Transportadora("ViaRapida");

        transportadora.enviar(encomenda1);
        transportadora.enviar(encomenda2);

        System.out.println(transportadora.toString());

    }
}
