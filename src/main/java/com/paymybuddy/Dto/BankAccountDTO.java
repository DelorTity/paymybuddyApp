package com.paymybuddy.Dto;

import lombok.Data;

@Data
public class BankAccountDTO {

    private int id;

    private  int userId;

    private String accountNumber;

    private Boolean active;

    private String description;

}