package com.company.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.company.exercise3.model.Bill;
import com.company.exercise3.model.Customer;
import com.company.exercise3.ThirdExercise;
import com.company.exercise3.model.User;

/**
 * Unit test for Third exercise
 */
public class ThirdExerciseTest {

	private static final String EMPLOYEE = "employee";
	private static final String AFFILIATE = "affiliate";
	private static final String CUSTOMER = "customer";
	private static final String NUM = "$990";
	private static BigDecimal AMOUNT;
	private Bill bill;

	@Before
	public void setUp() {
		AMOUNT = BigDecimal.valueOf(Long.valueOf(NUM.substring(1, NUM.length())));
		bill = new Bill();
		bill.setTotalAmount(AMOUNT);
	}

	@Test
	public void testNotUser() {
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.ZERO, totalAmount);
	}

	@Test
	public void testCatalogues() {
		User user = new User();
		bill.setUser(user);
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.valueOf(945), totalAmount);
	}

	@Test
	public void testEmployee() {
		User user = new User();
		user.setEmployee(EMPLOYEE);
		user.setGroceries(true);
		bill.setUser(user);
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.valueOf(663), totalAmount);
	}

	@Test
	public void testAffiliate() {
		User user = new User();
		user.setAffiliate(AFFILIATE);
		user.setGroceries(true);
		bill.setUser(user);
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.valueOf(851), totalAmount);
	}

	@Test
	public void testCustomer() {
		User user = new User();
		user.setGroceries(true);
		Customer customer = new Customer();
		customer.setName(CUSTOMER);
		customer.setYear(3);
		user.setCustomer(customer);
		bill.setUser(user);
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.valueOf(895.5), totalAmount);
	}

	@Test
	public void testNotCustomer() {
		User user = new User();
		user.setGroceries(true);
		Customer customer = new Customer();
		customer.setName(CUSTOMER);
		customer.setYear(2);
		user.setCustomer(customer);
		bill.setUser(user);
		ThirdExercise exercise = new ThirdExercise();
		BigDecimal totalAmount = exercise.getPaymentAmount(bill);
		assertEquals(BigDecimal.valueOf(945), totalAmount);
	}
}
