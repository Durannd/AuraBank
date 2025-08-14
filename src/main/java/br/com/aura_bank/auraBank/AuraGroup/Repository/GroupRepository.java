package br.com.aura_bank.auraBank.AuraGroup.Repository;
import br.com.aura_bank.auraBank.AuraGroup.Model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupModel, Long> {
}
