package com.ll.exam.sb_batch.app.cash.entity;

import com.ll.exam.sb_batch.app.base.entity.BaseEntity;
import com.ll.exam.sb_batch.app.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class CashLog extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Member member;
    private long price;
    private String eventType;
}
