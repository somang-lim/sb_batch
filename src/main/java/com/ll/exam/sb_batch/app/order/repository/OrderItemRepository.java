package com.ll.exam.sb_batch.app.order.repository;

import com.ll.exam.sb_batch.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
