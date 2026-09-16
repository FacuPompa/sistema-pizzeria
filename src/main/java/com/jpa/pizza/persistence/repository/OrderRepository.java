package com.jpa.pizza.persistence.repository;

import com.jpa.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
    List<OrderEntity> findAllByDateAfter(LocalDate date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);
}
