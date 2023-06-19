package com.receitas.receita.controllers;

import com.receitas.receita.DTOS.DTOUser;
import com.receitas.receita.models.User;
import com.receitas.receita.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User adicionaUsuario(@RequestBody DTOUser usuario) {
        User user = new User(usuario);
        userRepository.save(user);
        return user;
    }

    @GetMapping
    public List<DTOUser> pegandoTodosUsuarios() {
        return userRepository.findAll().stream().map(DTOUser::new).toList();
    }

    @GetMapping("/{id}")
    public Optional<User> pegandoPeloID(@PathVariable Long id) {
        return userRepository.findById(id);
    }
}
