package br.com.aura_bank.auraBank.Aura.Model;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_aura")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class AuraModel {
    @JsonIgnore
    @OneToOne(mappedBy = "aura")// aura das pessoas
    private UserModel usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "aura_quantidade")
    private Long quantidadeAura;
}


