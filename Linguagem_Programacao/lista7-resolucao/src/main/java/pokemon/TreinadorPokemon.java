package pokemon;

public class TreinadorPokemon {

    private String nome;
    private Integer nivel;


    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon){
        Double forcaBonus = pokemon.getForca();
        forcaBonus += forcaBonus * 0.1;
        pokemon.setForca(forcaBonus);

        Integer docesBonus = pokemon.getDoces();
        docesBonus += 10;
        pokemon.setDoces(docesBonus);

        this.nivel += 2;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        String nomePokemon = pokemon.getNome();
        if(pokemon.getDoces() >= 50){
         pokemon.setNome(nomeEvolucao);

         Integer novaQuantidadeDoces = pokemon.getDoces();
         novaQuantidadeDoces -= 50;
         pokemon.setDoces(novaQuantidadeDoces);

         this.nivel += 10;

            System.out.println(String.format("Pokemon %s evolui para %s!",nomePokemon,nomeEvolucao));
        }else{
            System.out.println("Não foi possível fazer esta operação!");
        }

    }
}
