package com.company.exercise3.model;

public class User {
    
    private String employee;
    
    private String affiliate;
    
    private Customer customer;
    
    private boolean isGroceries;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(String affiliate) {
        this.affiliate = affiliate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	public boolean isGroceries() {
		return isGroceries;
	}

	public void setGroceries(boolean isGroceries) {
		this.isGroceries = isGroceries;
	}
}
