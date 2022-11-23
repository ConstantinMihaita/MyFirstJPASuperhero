package ro.itschool;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.itschool.entity.Pokemon;
import ro.itschool.entity.Superhero;
import ro.itschool.repository.PokemonRepository;
import ro.itschool.repository.SuperheroRepository;

@Slf4j
@Component


public class AppCommandRunner implements CommandLineRunner {

    @Autowired
    private SuperheroRepository superheroRepository;

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) {

        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {

            Pokemon pokemon = new Pokemon();
            pokemon.setName(faker.pokemon().name());
            Pokemon pokemon1 = new Pokemon();
            pokemon1.setName(faker.pokemon().name());
            Pokemon pokemon2 = new Pokemon();
            pokemon2.setName(faker.pokemon().name());

            Superhero superhero = new Superhero();
            superhero.setName(faker.superhero().name());
            superhero.addPokemontoSuperhero(pokemon);
            superhero.addPokemontoSuperhero(pokemon1);
            superhero.addPokemontoSuperhero(pokemon2);

            superheroRepository.save(superhero);
        }

//        System.out.println(pokemonRepository.findAllByName("green"));
//        System.out.println(superheroRepository.findByNameEndingWith("%man"));
        System.out.println(superheroRepository.findSuperheros("%man"));

    }


}
