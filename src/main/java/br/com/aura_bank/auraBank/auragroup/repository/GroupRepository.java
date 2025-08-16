package br.com.aura_bank.auraBank.auragroup.repository;
import br.com.aura_bank.auraBank.auragroup.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupModel, Long> {
}
