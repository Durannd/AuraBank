package br.com.aura_bank.auraBank.Users.Controller;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import br.com.aura_bank.auraBank.Users.Service.UserService;
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
    public List<UserModel> list() {
        return userService.list();
    }
    // add user
    @PostMapping("/add")
    public UserModel addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }
    //list by id
    @GetMapping("/listar/{id}")
    public UserModel userModel(@PathVariable Long id){
        return userService.listById(id);
    }
    //delete by id
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
}
