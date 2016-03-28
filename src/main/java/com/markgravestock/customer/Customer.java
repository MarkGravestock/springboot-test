package com.markgravestock.customer;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private long id;
    @Getter @NonNull private String firstName;
    @Getter @NonNull private String lastName;
}