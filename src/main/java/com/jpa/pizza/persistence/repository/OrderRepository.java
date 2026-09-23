package com.jpa.pizza.persistence.repository;

import com.jpa.pizza.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
    List<OrderEntity> findAllByDateAfter(LocalDate date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);

    @Query(value = "SELECT * FROM pizza_order WHERE id_customer = :id", nativeQuery = true)
    List<OrderEntity> findCustomerOrders(@Param("id") String idCustomer);
}
