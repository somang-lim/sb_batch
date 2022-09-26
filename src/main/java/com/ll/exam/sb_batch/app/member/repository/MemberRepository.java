package com.ll.exam.sb_batch.app.member.repository;

import com.ll.exam.sb_batch.app.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
