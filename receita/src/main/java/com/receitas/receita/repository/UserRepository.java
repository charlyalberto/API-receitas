package com.receitas.receita.repository;

import com.receitas.receita.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
