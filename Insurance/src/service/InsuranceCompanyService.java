package service;


import model.BankAccount;
import model.Insurance;
import model.InsuranceCompany;
import model.PaymentMovement;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InsuranceCompanyService {
/*
    private String name;
    private String taxOffice;
    private String taxNumber;
    private String address;
    private BigDecimal commission;
    private ArrayList<Insurance> insuranceList;
    private ArrayList<BankAccount> bankAccountList;
    private ArrayList<PaymentMovement> paymentMovementList; */
    public InsuranceCompany createInsuranceCompany(String name, String taxOffice, String taxNumber, String address, BigDecimal commission) {
        InsuranceCompany insuranceCompany = new InsuranceCompany();
        insuranceCompany.setName(name);
        insuranceCompany.setTaxOffice(taxOffice);
        insuranceCompany.setTaxNumber(taxNumber);
        insuranceCompany.setAddress(address);
        insuranceCompany.setCommission(commission);
        return insuranceCompany;
    }

    public void addInsuranceToInsuranceCompany () {

    }
}
