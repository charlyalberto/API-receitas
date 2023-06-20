package receitas.receita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import receitas.receita.DTOS.DTOFood;
import receitas.receita.models.Food;
import receitas.receita.repositories.FoodRepository;

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