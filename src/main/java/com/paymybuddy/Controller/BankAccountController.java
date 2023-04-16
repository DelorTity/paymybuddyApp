package com.paymybuddy.Controller;

import com.paymybuddy.Entity.BankAccount;
import com.paymybuddy.Service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @RequestMapping("/")
    public String bankAccount(){

        return "bankAccount";
    }
}
