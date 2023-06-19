package com.receitas.receita.models;

import com.receitas.receita.DTOS.DTOUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "usuario")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User(DTOUser usuario) {
        this.name = usuario.name();
        this.email = usuario.email();
        this.password = usuario.password();
    }
}
