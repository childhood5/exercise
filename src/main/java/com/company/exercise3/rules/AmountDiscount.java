package com.company.exercise3.rules;

import java.math.BigDecimal;

import com.company.exercise3.model.User;

public class AmountDiscount extends AbstractDiscount {

	@Override
	public BigDecimal getDiscount(User user, BigDecimal totalAmount) {
		int amountDiscount = totalAmount.divide(BigDecimal.valueOf(100)).intValue() * 5;
		return totalAmount.subtract(BigDecimal.valueOf(amountDiscount));
	}

}