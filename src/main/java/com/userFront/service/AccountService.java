package com.userFront.service;

import com.userFront.domain.PrimaryAccount;
import com.userFront.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);
}
