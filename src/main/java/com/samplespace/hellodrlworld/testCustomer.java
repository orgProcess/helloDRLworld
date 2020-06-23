package com.samplespace.hellodrlworld;



public class testCustomer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String cust;


	public testCustomer() {
	}

	public java.lang.String getCust() {
		return this.cust;
	}

	public void setCust(java.lang.String cust) {
		this.cust = cust;
	}


	public testCustomer(java.lang.String cust) {
		this.cust = cust;
	}

}