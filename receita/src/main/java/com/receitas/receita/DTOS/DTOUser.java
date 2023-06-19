package com.receitas.receita.DTOS;

import com.receitas.receita.models.User;

public record DTOUser(String name, String email, String password) {
    public DTOUser(User user) {
        this(user.getName(), user.getEmail(), user.getPassword());
    }
}
