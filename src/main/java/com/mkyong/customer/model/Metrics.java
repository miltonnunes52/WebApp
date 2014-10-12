package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * Metrics generated by hbm2java
 */
public class Metrics {

	private Integer idMetrics;
	private String type;
	private String description;
	private String url;

	public Metrics() {
	}

	public Metrics(String type, String url) {
		this.type = type;
		this.url = url;
	}

	public Metrics(String type, String description, String url) {
		this.type = type;
		this.description = description;
		this.url = url;
	}

	public Integer getIdMetrics() {
		return this.idMetrics;
	}

	public void setIdMetrics(Integer idMetrics) {
		this.idMetrics = idMetrics;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}