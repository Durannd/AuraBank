package br.com.aura_bank.auraBank.Users.Controller;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import br.com.aura_bank.auraBank.Users.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inicio")
public class UserController {
    UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem Vindo ao Inicio!";
    }

    @GetMapping("/listar")
    public List<UserModel> list() {
        return userService.list();
    }


}
