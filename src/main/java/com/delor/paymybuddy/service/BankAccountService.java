package com.delor.paymybuddy.service;

import com.delor.paymybuddy.entity.BankAccount;

import java.util.List;

public interface BankAccountService {
    List<BankAccount> getAll();
    BankAccount save(BankAccount account);

}