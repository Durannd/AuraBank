package br.com.aura_bank.auraBank.Users.Controller;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/inicio")
    public String boasVindas(){
        return "Bem Vindo ao Inicio!";
    }




}
