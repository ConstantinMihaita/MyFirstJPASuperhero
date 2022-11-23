package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.itschool.entity.Superhero;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {

//    Superhero findByName(String name);

//    @Query("SELECT s FROM Superhero s WHERE s.name like ?1")
//    List<Superhero> findByNameEndingWith(String name);

//    @Query(value = "SELECT * FROM Superhero  WHERE name like ?1", nativeQuery = true)
//    List<Superhero> getMeMySuperheroNative(String name);

    @Query("SELECT s FROM Superhero s WHERE s.name like :name")
    List<Superhero> findSuperheros(@Param("name") String name);
}
