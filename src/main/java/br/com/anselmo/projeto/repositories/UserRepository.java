package br.com.anselmo.projeto.repositories;

import br.com.anselmo.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
