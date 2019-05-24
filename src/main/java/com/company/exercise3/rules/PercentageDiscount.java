package com.company.exercise3.rules;

import java.math.BigDecimal;

import com.company.exercise3.model.Customer;
import com.company.exercise3.model.User;

public class PercentageDiscount extends AbstractDiscount {

	private static final String EMPLOYEE = "employee";
	private static final String AFFILIATE = "affiliate";
	private static final String CUSTOMER = "customer";

	@Override
	public BigDecimal getDiscount(User user, BigDecimal totalAmount) {
		if (user.isGroceries()) {
			Customer customer = user.getCustomer();
			if (EMPLOYEE.equals(user.getEmployee())) {
				totalAmount = totalAmount.multiply(BigDecimal.valueOf(70)).divide(BigDecimal.valueOf(100));
			} else if (AFFILIATE.equals(user.getAffiliate())) {
				totalAmount = totalAmount.multiply(BigDecimal.valueOf(90)).divide(BigDecimal.valueOf(100));
			} else if (CUSTOMER.equals(customer.getName()) && customer.getYear() > 2) {
				totalAmount = totalAmount.multiply(BigDecimal.valueOf(95)).divide(BigDecimal.valueOf(100));
			}
		}
		return totalAmount;
	}

}