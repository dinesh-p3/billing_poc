package com.billing.billing.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "usage_tier")
public class UsageTier {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private Date startDate;
    private Date endDate;
    private Date createdAt;
    private long queryCount;
    private long resultSizeInBytes;
    private int concurrent_user_count;
    private DurationType durationType;

}
