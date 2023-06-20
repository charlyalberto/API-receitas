package receitas.receita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import receitas.receita.DTOS.DTORevenue;
import receitas.receita.models.Revenue;
import receitas.receita.repositories.RevenueRepository;

import java.util.List;
@RestController
@RequestMapping("revenue")
public class RevenueController {
    @Autowired
    private RevenueRepository revenueRepository;

    @PostMapping
    public void criandoReceita(@RequestBody DTORevenue data) {
        Revenue revenue = new Revenue(data);
        revenueRepository.save(revenue);
        return;
    }

    @GetMapping
    public List<DTORevenue> ListaReceitas() {
        List<DTORevenue> revenueList = revenueRepository.findAll().stream().map(DTORevenue::new).toList();
        return revenueList;
    }

}
