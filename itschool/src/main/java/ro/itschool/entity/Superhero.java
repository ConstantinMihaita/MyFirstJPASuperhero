package ro.itschool.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity

public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

private String name;

@OneToMany(mappedBy = "superhero", cascade = CascadeType.ALL)
    private List<Pokemon> pokemons = new ArrayList<>();

    public void addPokemontoSuperhero(Pokemon p) {
        pokemons.add(p);
        p.setSuperhero(this);
    }


}
