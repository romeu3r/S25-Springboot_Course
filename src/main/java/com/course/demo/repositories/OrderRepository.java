package com.course.demo.repositories;

import com.course.demo.entities.Order;
import com.course.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
