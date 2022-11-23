package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "superhero_id")
    @ToString.Exclude
    private Superhero superhero;

}
