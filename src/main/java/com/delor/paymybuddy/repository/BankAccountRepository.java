package com.delor.paymybuddy.repository;

import com.delor.paymybuddy.entity.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
}