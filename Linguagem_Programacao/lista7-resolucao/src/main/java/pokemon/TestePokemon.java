package pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Lapras","Água",20.0,10);
        Pokemon pokemon2 = new Pokemon("Charmander","Fogo",10.0,5);

        System.out.println(pokemon1.toString());
        System.out.println(pokemon2.toString());

        TreinadorPokemon treinadorPokemon1 = new TreinadorPokemon("Natan",5);

        treinadorPokemon1.treinarPokemon(pokemon2);
        treinadorPokemon1.treinarPokemon(pokemon2);
        treinadorPokemon1.treinarPokemon(pokemon2);
        treinadorPokemon1.treinarPokemon(pokemon2);
        treinadorPokemon1.treinarPokemon(pokemon2);

        System.out.println(pokemon2.toString());

        treinadorPokemon1.evoluirPokemon(pokemon2,"Charmilion");

        System.out.println(pokemon2.toString());

        treinadorPokemon1.treinarPokemon(pokemon1);
        treinadorPokemon1.treinarPokemon(pokemon1);

        System.out.println(pokemon1.toString());

        treinadorPokemon1.evoluirPokemon(pokemon1,"Aquaman");

        System.out.println(treinadorPokemon1.toString());
    }
}
