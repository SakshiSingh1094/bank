package com.eazybytes.accounts.entity;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@Getter@Setter@ToString
public class BaseEntity {

    @Column
  private LocalDateTime  createdAt;

    @Column
  private String createdBy;

    @Column
  private LocalDateTime updatedAt;

    @Column
  private String updateddBy;
}
