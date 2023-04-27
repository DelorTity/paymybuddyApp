package com.delor.paymybuddy.controller;

import com.delor.paymybuddy.entity.BankAccount;
import com.delor.paymybuddy.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping
    public String bankAccount(Model model){
        List<BankAccount> accountsNumbers = bankAccountService.getAll();
        model.addAttribute("accountsNumbers", accountsNumbers);
        return "bankAccount1";
    }

    @GetMapping("/bankAccount/newAccount")
    public String AddBankAccount(Model model) {
        model.addAttribute("bankAccount", new BankAccount());
        return "newAccount";
    }
}
