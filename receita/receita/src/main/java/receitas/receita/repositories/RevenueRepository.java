package receitas.receita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import receitas.receita.models.Revenue;

public interface RevenueRepository extends JpaRepository<Revenue, Long> {
}
