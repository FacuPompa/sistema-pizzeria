package com.jpa.pizza.persistence.repository;

import com.jpa.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
