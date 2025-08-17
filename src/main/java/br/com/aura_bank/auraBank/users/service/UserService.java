package br.com.aura_bank.auraBank.users.service;

import br.com.aura_bank.auraBank.users.dto_mapper.UserDTO;
import br.com.aura_bank.auraBank.users.dto_mapper.UserMapper;
import br.com.aura_bank.auraBank.users.model.UserModel;
import br.com.aura_bank.auraBank.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    //constructor method to initialize userRepository.
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    //list users
    public List<UserDTO> list() {
        List<UserModel> lista = userRepository.findAll();
        return lista.stream()
                .map(userMapper::map)
                .collect(Collectors.toList());

    }

    //adds user
    public UserDTO addUser(UserDTO userDTO) {
        UserModel usuario = userMapper.map(userDTO);
        userRepository.save(usuario);
        return userMapper.map(usuario);
    }

    //get users by id
    public UserDTO listById(Long id) {
        Optional<UserModel> user = userRepository.findById(id);
        return user.map(userMapper::map).orElse(null);
    }

    //delete by id
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
