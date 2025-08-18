package br.com.aura_bank.auraBank.users.dto_mapper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private Long id;
    private String name;
    private Long qtd_aura;

    private String login;
    private String password;
}
