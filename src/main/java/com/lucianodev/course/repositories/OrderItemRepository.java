package com.lucianodev.course.repositories;

import com.lucianodev.course.entities.OrderItem;
import com.lucianodev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
