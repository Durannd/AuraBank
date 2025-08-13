package br.com.aura_bank.auraBank.Aura.Service;

import br.com.aura_bank.auraBank.Aura.Model.AuraModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuraRepository extends JpaRepository<AuraModel, Long> {
}
