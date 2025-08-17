package br.com.aura_bank.auraBank.users.controller;

import br.com.aura_bank.auraBank.users.dto_mapper.UserDTO;
import br.com.aura_bank.auraBank.users.model.UserModel;
import br.com.aura_bank.auraBank.users.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inicio")
public class UserController {
    UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }
    //list all user
    @GetMapping("/list")
    public List<UserDTO> list() {
        return userService.list();
    }
    // add user
    @PostMapping("/add")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }
    //list by id
    @GetMapping("/listar/{id}")
    public UserDTO userDTO(@PathVariable Long id){
        return userService.listById(id);
    }
    //delete by id
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
}
