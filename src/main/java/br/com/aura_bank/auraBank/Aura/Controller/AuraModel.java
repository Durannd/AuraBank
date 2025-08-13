package br.com.aura_bank.auraBank.Aura.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class AuraModel {
    @GetMapping
    public String boasVindas(){
        return "Welcome! You're in the Aura!";
    }
}
