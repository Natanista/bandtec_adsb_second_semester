package br.com.bandtec.bolo;

public class App {

    public static void main(String[] args) {

        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        bolo1.sabor = "Chocolate";
        bolo1.valor = 20.00;
        bolo1.comprarBolo(9);
        bolo1.comprarBolo(2);
        bolo1.comprarBolo(3);
        bolo1.comprarBolo(1);
        bolo1.comprarBolo(8);

        bolo2.sabor = "Baunilha";
        bolo2.valor = 90.00;
        bolo2.comprarBolo(20);
        bolo2.comprarBolo(10);
        bolo2.comprarBolo(20);
        bolo2.comprarBolo(30);
        bolo2.comprarBolo(50);

        bolo3.sabor = "Brigadeiro";
        bolo3.valor = 10.00;
        bolo3.comprarBolo(9);
        bolo3.comprarBolo(18);
        bolo3.comprarBolo(89);
        bolo3.comprarBolo(34);
        bolo3.comprarBolo(13);

        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();

    }
}
