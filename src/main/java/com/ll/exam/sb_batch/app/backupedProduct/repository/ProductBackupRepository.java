package com.ll.exam.sb_batch.app.backupedProduct.repository;

import com.ll.exam.sb_batch.app.backupedProduct.entity.ProductBackup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductBackupRepository extends JpaRepository<ProductBackup, Long> {
    Optional<ProductBackup> findByProductId(Long id);
}
