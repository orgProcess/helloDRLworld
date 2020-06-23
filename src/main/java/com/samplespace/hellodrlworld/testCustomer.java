package com.samplespace.hellodrlworld;

import com.samplespace.hellopojoworld.Customer;

public class testCustomer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String cust;

	@org.kie.api.definition.type.Label("cn")
	private com.samplespace.hellopojoworld.Customer custName;

	public testCustomer() {
	}

	public java.lang.String getCust() {
		return this.cust;
	}

	public void setCust(java.lang.String cust) {
		this.cust = cust;
	}

	public com.samplespace.hellopojoworld.Customer getCustName() {
		return this.custName;
	}

	public void setCustName(com.samplespace.hellopojoworld.Customer custName) {
		this.custName = custName;
	}

	public testCustomer(java.lang.String cust,
			com.samplespace.hellopojoworld.Customer custName) {
		this.cust = cust;
		this.custName = custName;
	}

}