package com.gerenciamento.gerencia.repositories;

import com.gerenciamento.gerencia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
