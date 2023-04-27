package com.delor.paymybuddy.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "account_number")
    private String accountNumber;


}
