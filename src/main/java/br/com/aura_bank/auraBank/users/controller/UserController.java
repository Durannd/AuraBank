package br.com.aura_bank.auraBank.users.controller;

import br.com.aura_bank.auraBank.users.dto_mapper.UserDTO;

import br.com.aura_bank.auraBank.users.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inicio")
@CrossOrigin(origins = "*")
public class UserController {
    UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }
    //list all user
    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> list() {
        List<UserDTO> lista = userService.list();
        return  ResponseEntity.ok(lista);
    }
    // add user
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO) {
        System.out.println("Aura recebida: "+userDTO.getQtd_aura());
        UserDTO user= userService.addUser(userDTO);
        return ResponseEntity.ok("Adiconado com sucesso! \n"+user);
    }
    //list by id
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> userDTO(@PathVariable Long id){
        UserDTO userDTO =  userService.listById(id);
        if(userDTO!= null){
            return ResponseEntity.ok(userDTO);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Id não encontrado.");
        }
    }
    //delete by id
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        UserDTO userDTO = userService.listById(id);
        if(userDTO!= null){
            userService.deleteById(id);
            return ResponseEntity.ok(userDTO.getName()+" removido com Sucesso!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja não encontrado!");
        }
    }
}
