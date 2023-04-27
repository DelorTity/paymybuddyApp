package com.delor.paymybuddy.service;

import com.delor.paymybuddy.entity.BankAccount;
import com.delor.paymybuddy.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
        @Override
        public List<BankAccount> getAll() {
            return (List<BankAccount>) bankAccountRepository.findAll();
        }

    @Override
    public BankAccount save(BankAccount account) {
        return bankAccountRepository.save(account);
    }
}