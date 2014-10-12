package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * DataContext generated by hbm2java
 */
public class DataContext {

	private Integer idDataContext;
	private String description;
	private String tag;

	public DataContext() {
	}

	public DataContext(String description, String tag) {
		this.description = description;
		this.tag = tag;
	}

	public Integer getIdDataContext() {
		return this.idDataContext;
	}

	public void setIdDataContext(Integer idDataContext) {
		this.idDataContext = idDataContext;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}