package com.samplespace.hellodrlworld;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class testCustomer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Cust")
	private com.samplespace.hellopojoworld.Customer cust;

	public testCustomer() {
	}

	public com.samplespace.hellopojoworld.Customer getCust() {
		return this.cust;
	}

	public void setCust(com.samplespace.hellopojoworld.Customer cust) {
		this.cust = cust;
	}

	public testCustomer(com.samplespace.hellopojoworld.Customer cust) {
		this.cust = cust;
	}

}