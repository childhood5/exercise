package com.company.exercise3.rules;

import java.math.BigDecimal;

import com.company.exercise3.model.User;

public abstract class AbstractDiscount {

	public abstract BigDecimal getDiscount(User user, BigDecimal totalAmount);

}
