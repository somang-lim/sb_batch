package com.ll.exam.sb_batch.app.order.repository;

import com.ll.exam.sb_batch.app.order.entity.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    Page<OrderItem> findAllByLessThan(long id, Pageable pageable);
}
