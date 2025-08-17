package br.com.aura_bank.auraBank.users.model;


import br.com.aura_bank.auraBank.auragroup.model.GroupModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)// tipo da estrategia de gerar o id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "qtd_aura")
    private Long qtdAura;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "tb_group_id") // Nome da coluna da chave estrangeira
    private GroupModel user_group;


}
