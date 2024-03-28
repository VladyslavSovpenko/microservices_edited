package com.eazybytes.accounts.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="column_id")
    private Long customerId;
    private String name;
    private String email;
    @Column(name="mobile_number")
    private String mobileNumber;
}
