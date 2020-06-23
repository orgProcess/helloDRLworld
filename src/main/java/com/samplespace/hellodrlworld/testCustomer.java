package com.samplespace.hellodrlworld;

public class testCustomer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String cust;

	@org.kie.api.definition.type.Label(value = "Customer")
	private com.samplespace.hellopojoworld01.Customer01 customer;

	public testCustomer() {
	}

	public java.lang.String getCust() {
		return this.cust;
	}

	public void setCust(java.lang.String cust) {
		this.cust = cust;
	}

	public com.samplespace.hellopojoworld01.Customer01 getCustomer() {
		return this.customer;
	}

	public void setCustomer(com.samplespace.hellopojoworld01.Customer01 customer) {
		this.customer = customer;
	}

	public testCustomer(java.lang.String cust,
			com.samplespace.hellopojoworld01.Customer01 customer) {
		this.cust = cust;
		this.customer = customer;
	}

}