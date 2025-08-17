package br.com.aura_bank.auraBank.users.dto_mapper;

import br.com.aura_bank.auraBank.users.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserModel map(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setId(userDTO.getId());
        userModel.setName(userDTO.getName());
        userModel.setUser_group(userDTO.getUser_group());
        userModel.setQtdAura(userDTO.getQtdAura());
        userModel.setPassword(userDTO.getPassword());
        userModel.setLogin(userDTO.getLogin());
        return userModel;
    }

    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setName(userModel.getName());
        userDTO.setUser_group(userModel.getUser_group());
        userDTO.setQtdAura(userModel.getQtdAura());
        userDTO.setLogin(userModel.getLogin());
        userDTO.setPassword(userModel.getPassword());
        return userDTO;
    }
}
