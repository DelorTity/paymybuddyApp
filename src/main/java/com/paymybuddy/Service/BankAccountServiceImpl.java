package com.paymybuddy.Service;

import com.paymybuddy.Entity.BankAccount;
import com.paymybuddy.Repository.BankAccountRepository;
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
            return bankAccountRepository.findAll();
        }
}