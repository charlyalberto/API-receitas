package receitas.receita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import receitas.receita.DTOS.DTOUser;
import receitas.receita.models.User;
import receitas.receita.repositories.UserRepository;

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

    @PutMapping("/{id}")
    public void editarUsuario(@PathVariable Long id, @RequestBody User user) {
        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isPresent()) {
            User usuario = optionalUser.get();
            usuario.setName(user.getName());
            usuario.setEmail(user.getEmail());
            usuario.setPassword(user.getPassword());

            userRepository.save(usuario);
        }
    }

    @DeleteMapping
    public void DeletarUsuario(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
