package receitas.receita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import receitas.receita.models.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}