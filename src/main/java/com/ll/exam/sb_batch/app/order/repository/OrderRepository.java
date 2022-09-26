package com.ll.exam.sb_batch.app.order.repository;

import com.ll.exam.sb_batch.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
