package com.delor.paymybuddy.repository;

import com.delor.paymybuddy.entity.BankAccount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class BankAccountRepositoryTests {
    @Autowired private BankAccountRepository repo;

    @Test
    public void testAddNewBankAccountIsTrue() {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("098876766755441");

        BankAccount account = repo.save(bankAccount);
        Assertions.assertThat(account).isNotNull();
        Assertions.assertThat(account.getId()).isGreaterThan(0);
    }

    @Test
    public void testAddNewBankAccountIsNotTrue(){
        BankAccount bankAccount = new BankAccount();

        BankAccount account = repo.save(bankAccount);
        Assertions.assertThat(account.getId()).isNull();
        Assertions.assertThat(account.getId()).isLessThan(2);
    }
}

