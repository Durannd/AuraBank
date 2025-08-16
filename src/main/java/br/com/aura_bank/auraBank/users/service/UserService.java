package br.com.aura_bank.auraBank.users.service;

import br.com.aura_bank.auraBank.users.model.UserModel;
import br.com.aura_bank.auraBank.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;
    //constructor method to initialize userRepository.
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    //list users
    public List<UserModel> list(){
        return userRepository.findAll();
    }
    //adds user
    public UserModel addUser(UserModel userModel){
      return userRepository.save(userModel);
    }
    //get users by id
    public UserModel listById(Long id){
        Optional<UserModel> user = userRepository.findById(id);
        return user.orElse(null);
    }
    //delete by id
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
