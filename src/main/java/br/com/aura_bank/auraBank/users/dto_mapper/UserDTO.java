package br.com.aura_bank.auraBank.users.dto_mapper;

import br.com.aura_bank.auraBank.auragroup.model.GroupModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private Long id;
    private String name;
    private Long qtdAura;
    private GroupModel user_group;
}
