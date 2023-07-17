package service;

import model.Policy;
import model.Vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class PolicyService {

    /*
     private InsuranceCompany insuranceCompany;
    private Vehicle vehicle;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;
     */
    public Policy createPolicy(BigDecimal price, Date startDate, Date endDate) {
        Policy policy = new Policy();
        policy.setPrice(price);
        policy.setStartDate(startDate);
        policy.setEndDate(endDate);

        return policy;
    }

}
