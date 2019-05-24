package com.company.exercise3;

import java.math.BigDecimal;

import com.company.exercise3.model.Bill;
import com.company.exercise3.model.User;
import com.company.exercise3.rules.AbstractDiscount;
import com.company.exercise3.rules.AmountDiscount;
import com.company.exercise3.rules.PercentageDiscount;

public class ThirdExercise {

	public BigDecimal getPaymentAmount(Bill bill) {
		User user = bill.getUser();
		BigDecimal totalAmount = bill.getTotalAmount();
		if (null != user) {
			AbstractDiscount percentageDiscount = new PercentageDiscount();
			AbstractDiscount amountDiscount = new AmountDiscount();
			totalAmount = percentageDiscount.getDiscount(user, totalAmount);
			return amountDiscount.getDiscount(user, totalAmount);
		}
		return BigDecimal.ZERO;
	}
}
