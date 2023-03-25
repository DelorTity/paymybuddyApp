package com.paymybuddy.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountCreate {
    @Length(min = 7, message = "the minimum value is 7")
    /*@NotBlank(message = "please fill the column")*/
    @Column(unique=true)
    private String accountNumber;

    @Length(min = 3, message = "the minimum value is 3")
   /* @NotBlank(message = "please fill the column")*/
    private String description;
}