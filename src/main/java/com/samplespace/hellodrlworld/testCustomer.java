package com.samplespace.hellodrlworld;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class testCustomer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Cust")
	private String cust;

	@org.kie.api.definition.type.Label(value = "Customer")
	private com.samplespace.hellopojoworld.Customer customer;

	public testCustomer() {
	}

	public java.lang.String getCust() {
		return this.cust;
	}

	public void setCust(java.lang.String cust) {
		this.cust = cust;
	}

	public com.samplespace.hellopojoworld.Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(com.samplespace.hellopojoworld.Customer customer) {
		this.customer = customer;
	}

	public testCustomer(java.lang.String cust,
			com.samplespace.hellopojoworld.Customer customer) {
		this.cust = cust;
		this.customer = customer;
	}

}