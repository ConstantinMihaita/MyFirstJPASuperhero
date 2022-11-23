package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Pokemon;

import java.util.List;

public interface PokemonRepository extends JpaRepository {

    List<Pokemon> findAllByName(String name);

}
