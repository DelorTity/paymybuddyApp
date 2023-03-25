package com.paymybuddy.Service;

import com.paymybuddy.Dto.BankAccountCreate;
import com.paymybuddy.Entity.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BankAccountService {
    List<BankAccount> getAll();
    void save(BankAccountCreate bankAccountCreate);

    Page<BankAccount> findPaginated(Pageable pageable);

}