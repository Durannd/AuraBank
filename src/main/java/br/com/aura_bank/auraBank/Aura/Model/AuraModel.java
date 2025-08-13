package br.com.aura_bank.auraBank.Aura.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_aura")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuraModel {
    @OneToMany(mappedBy = "auras")// aura das pessoas
    private long aura;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
