package com.paymybuddy.Service;

import com.paymybuddy.Dto.BankAccountCreate;
import com.paymybuddy.Entity.BankAccount;
import com.paymybuddy.Exceptions.BankAccountAlreadyExist;
import com.paymybuddy.Repository.BankAccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        @Override
        public void save(BankAccountCreate bankAccountCreate) {
            Optional<BankAccount> optionalBankAccount = bankAccountRepository.findByAccountNumber(bankAccountCreate.getAccountNumber());
            if (optionalBankAccount.isPresent()) {
                throw new BankAccountAlreadyExist();
            }

            BankAccount bankAccount = new BankAccount();
            bankAccount.setAccountNumber(bankAccountCreate.getAccountNumber());

            bankAccountRepository.save(bankAccount);
        }

        @Override
        public Page<BankAccount> findPaginated(Pageable pageable) {
            return bankAccountRepository.findAllByOrderByCreatedAtDesc(pageable);
        }
}