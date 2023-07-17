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

    public void addInsuranceToInsuranceCompany (Insurance insurance, InsuranceCompany insuranceCompany) {
        if(insuranceCompany.getInsuranceList()!= null) {
            insuranceCompany.getInsuranceList().add(insurance);
        }else {}
        ArrayList<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(insurance);
        insuranceCompany.setInsuranceList(insuranceList);
    }
    /*
    private ArrayList<BankAccount> bankAccountList;
     */
    public void addBankAccountToInsuranceCompany(InsuranceCompany insuranceCompany, BankAccount bankAccount){
        if(insuranceCompany.getBankAccountList() !=null){
            insuranceCompany.getBankAccountList().add(bankAccount);
        }else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            insuranceCompany.setBankAccountList(bankAccountList);
        }



    }
}
