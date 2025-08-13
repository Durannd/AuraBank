package br.com.aura_bank.auraBank.Users.Repository;

import br.com.aura_bank.auraBank.Users.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
