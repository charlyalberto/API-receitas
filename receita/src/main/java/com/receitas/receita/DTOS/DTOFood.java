package com.receitas.receita.DTOS;

import com.receitas.receita.models.Food;

public record DTOFood(Long id, String nome, String image, Double price) {
    public DTOFood(Food food) {
       this(food.getId(),food.getNome(), food.getImage(), food.getPrice());
    }
}
