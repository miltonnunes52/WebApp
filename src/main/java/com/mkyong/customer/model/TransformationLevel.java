package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * TransformationLevel generated by hbm2java
 */
public class TransformationLevel {

	private Integer idTransformationLevel;
	private String level;

	public TransformationLevel() {
	}

	public TransformationLevel(String level) {
		this.level = level;
	}

	public Integer getIdTransformationLevel() {
		return this.idTransformationLevel;
	}

	public void setIdTransformationLevel(Integer idTransformationLevel) {
		this.idTransformationLevel = idTransformationLevel;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
