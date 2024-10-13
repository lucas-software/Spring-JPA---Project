package com.gerenciamento.gerencia.repositories;

import com.gerenciamento.gerencia.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
