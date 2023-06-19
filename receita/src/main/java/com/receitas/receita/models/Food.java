package com.receitas.receita.models;

import com.receitas.receita.DTOS.DTOFood;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "menu")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String image;
    Double price;

    public Food(DTOFood data) {
        this.nome = data.nome();
        this.image = data.image();
        this.price = data.price();
    }
}
