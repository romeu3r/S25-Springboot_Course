package com.course.demo.repositories;

import com.course.demo.entities.OrderItem;
import com.course.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
