package com.company.exercise3;

import java.math.BigDecimal;

public class ThirdExercise {

    private static final String GROCERIES = "groceries";
    private static final String EMPLOYEE = "employee";
    private static final String AFFILIATE = "affiliate";
    private static final String CUSTOMER = "customer";

    public BigDecimal getPaymentAmount(Bill bill) {
        
        String groceries =  bill.getGroceries().getCatalogues();
        User user =  bill.getUser();
        BigDecimal totalAmount = bill.getTotalAmount();
        if(null != user) {
            Customer customer =  user.getCustomer();
            if (!GROCERIES.equals(groceries)) {
                if (EMPLOYEE.equals(user.getEmployee())) {
                    totalAmount = totalAmount.multiply(BigDecimal.valueOf(70)).divide(BigDecimal.valueOf(100));
                } else if (AFFILIATE.equals(user.getAffiliate())) {
                    totalAmount = totalAmount.multiply(BigDecimal.valueOf(90)).divide(BigDecimal.valueOf(100));
                } else if (customer != null && CUSTOMER.equals(customer.getName()) && customer.getYear() > 2) {
                    totalAmount = totalAmount.multiply(BigDecimal.valueOf(95)).divide(BigDecimal.valueOf(100));
                }
            }
            int amountDiscount = totalAmount.divide(BigDecimal.valueOf(100)).intValue() * 5;
            return totalAmount.subtract(BigDecimal.valueOf(amountDiscount));
        }
        return BigDecimal.ZERO;
    }

}
