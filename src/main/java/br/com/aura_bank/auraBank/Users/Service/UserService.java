package br.com.aura_bank.auraBank.Users.Service;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import br.com.aura_bank.auraBank.Users.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<UserModel> list(){
        return userRepository.findAll();
    }
}
