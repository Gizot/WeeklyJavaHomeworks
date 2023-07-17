package service;

import model.BankAccount;

import java.math.BigDecimal;

public class BankAccountService {
    /*
    private String name;
    private String iban;
    private BigDecimal amount;
     */
    public BankAccount createBankAccount(String name, String iban, BigDecimal amount){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName(name);
        bankAccount.setIban(iban);
        bankAccount.setAmount(amount);

        return bankAccount;
    }
}
