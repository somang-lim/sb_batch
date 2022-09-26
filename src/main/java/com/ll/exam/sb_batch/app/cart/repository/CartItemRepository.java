package com.ll.exam.sb_batch.app.cart.repository;

import com.ll.exam.sb_batch.app.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
