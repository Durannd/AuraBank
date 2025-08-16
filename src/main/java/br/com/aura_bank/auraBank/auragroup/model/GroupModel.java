package br.com.aura_bank.auraBank.auragroup.model;

import br.com.aura_bank.auraBank.users.model.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name = "tb_group")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupModel {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String nome;

    @OneToMany(mappedBy = "user_group")
    @JsonIgnore
    private List<UserModel> userModelList;

}
