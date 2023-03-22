package com.projet.pcd.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Client, Integer> {

  Optional<Client> findByEmail(String email);

}
