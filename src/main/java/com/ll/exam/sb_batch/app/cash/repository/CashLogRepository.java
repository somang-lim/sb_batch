package com.ll.exam.sb_batch.app.cash.repository;

import com.ll.exam.sb_batch.app.cash.entity.CashLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashLogRepository extends JpaRepository<CashLog, Long> {
}
