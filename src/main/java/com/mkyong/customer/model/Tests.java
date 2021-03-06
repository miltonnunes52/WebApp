package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * Tests generated by hbm2java
 */
public class Tests {

	private Integer idTests;
	private String description;
	private String timeCreation;
	private int dataContextIdDataContext;

	public Tests() {
	}

	public Tests(int dataContextIdDataContext) {
		this.dataContextIdDataContext = dataContextIdDataContext;
	}

	public Tests(String description, String timeCreation,
			int dataContextIdDataContext) {
		this.description = description;
		this.timeCreation = timeCreation;
		this.dataContextIdDataContext = dataContextIdDataContext;
	}

	public Integer getIdTests() {
		return this.idTests;
	}

	public void setIdTests(Integer idTests) {
		this.idTests = idTests;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTimeCreation() {
		return this.timeCreation;
	}

	public void setTimeCreation(String timeCreation) {
		this.timeCreation = timeCreation;
	}

	public int getDataContextIdDataContext() {
		return this.dataContextIdDataContext;
	}

	public void setDataContextIdDataContext(int dataContextIdDataContext) {
		this.dataContextIdDataContext = dataContextIdDataContext;
	}

}
