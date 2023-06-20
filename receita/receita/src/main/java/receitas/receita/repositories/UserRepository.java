package receitas.receita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import receitas.receita.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
