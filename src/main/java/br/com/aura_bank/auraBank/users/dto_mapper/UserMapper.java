package br.com.aura_bank.auraBank.users.dto_mapper;

import br.com.aura_bank.auraBank.users.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserModel map(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setId(userDTO.getId());
        userModel.setName(userDTO.getName());

        userModel.setQtdAura(userDTO.getQtd_aura());
        userModel.setPassword(userDTO.getPassword());
        userModel.setLogin(userDTO.getLogin());
        return userModel;
    }

    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setName(userModel.getName());

        userDTO.setQtd_aura(userModel.getQtdAura());
        userDTO.setLogin(userModel.getLogin());
        userDTO.setPassword(userModel.getPassword());
        return userDTO;
    }
}
