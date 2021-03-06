package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * ClassificationTags generated by hbm2java
 */
public class ClassificationTags {

	private Integer idClassificationTags;
	private String description;
	private String symbol;
	private int modalitiesIdModalities;

	public ClassificationTags() {
	}

	public ClassificationTags(int modalitiesIdModalities) {
		this.modalitiesIdModalities = modalitiesIdModalities;
	}

	public ClassificationTags(String description, String symbol,
			int modalitiesIdModalities) {
		this.description = description;
		this.symbol = symbol;
		this.modalitiesIdModalities = modalitiesIdModalities;
	}

	public Integer getIdClassificationTags() {
		return this.idClassificationTags;
	}

	public void setIdClassificationTags(Integer idClassificationTags) {
		this.idClassificationTags = idClassificationTags;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getModalitiesIdModalities() {
		return this.modalitiesIdModalities;
	}

	public void setModalitiesIdModalities(int modalitiesIdModalities) {
		this.modalitiesIdModalities = modalitiesIdModalities;
	}

}
