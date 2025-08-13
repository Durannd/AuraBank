package br.com.aura_bank.auraBank.Users.Model;

import br.com.aura_bank.auraBank.Aura.Model.AuraModel;
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

    @Column(name = "user_group")
    private String group;

    @OneToOne // uma pessoa só pode ter 1 quantidade de aura
    @JoinColumn(name = "aura_id")// definir na tabela de aura
    private AuraModel aura;

}
