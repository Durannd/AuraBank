package br.com.aura_bank.auraBank.users.repository;

import br.com.aura_bank.auraBank.users.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
