package com.course.demo.repositories;

import com.course.demo.entities.Category;
import com.course.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
