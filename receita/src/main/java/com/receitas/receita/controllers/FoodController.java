package com.receitas.receita.controllers;

import com.receitas.receita.DTOS.DTOFood;
import com.receitas.receita.models.Food;
import com.receitas.receita.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController

@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public void salvarMenu(@RequestBody DTOFood data) {
            Food foodData = new Food(data);
            foodRepository.save(foodData);
            return;
    }

    @GetMapping
    public List<DTOFood> ListaMenu(){
        List<DTOFood> foodList = foodRepository.findAll().stream().map(DTOFood::new).toList();
        return foodList;
    }
}
