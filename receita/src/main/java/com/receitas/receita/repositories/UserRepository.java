package com.receitas.receita.repositories;

import com.receitas.receita.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
