package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * MidlevelInformation generated by hbm2java
 */
public class MidlevelInformation {

	private Integer idMidlevelInformation;
	private String description;
	private String feature;
	private int highlevelIdHighlevel;
	private int dataContextIdDataContext;
	private int sensingDataIdSensing;
	private int sensingDataSensorNodeIdSensorNode;
	private int metricsIdMetrics;

	public MidlevelInformation() {
	}

	public MidlevelInformation(int highlevelIdHighlevel,
			int dataContextIdDataContext, int sensingDataIdSensing,
			int sensingDataSensorNodeIdSensorNode, int metricsIdMetrics) {
		this.highlevelIdHighlevel = highlevelIdHighlevel;
		this.dataContextIdDataContext = dataContextIdDataContext;
		this.sensingDataIdSensing = sensingDataIdSensing;
		this.sensingDataSensorNodeIdSensorNode = sensingDataSensorNodeIdSensorNode;
		this.metricsIdMetrics = metricsIdMetrics;
	}

	public MidlevelInformation(String description, String feature,
			int highlevelIdHighlevel, int dataContextIdDataContext,
			int sensingDataIdSensing, int sensingDataSensorNodeIdSensorNode,
			int metricsIdMetrics) {
		this.description = description;
		this.feature = feature;
		this.highlevelIdHighlevel = highlevelIdHighlevel;
		this.dataContextIdDataContext = dataContextIdDataContext;
		this.sensingDataIdSensing = sensingDataIdSensing;
		this.sensingDataSensorNodeIdSensorNode = sensingDataSensorNodeIdSensorNode;
		this.metricsIdMetrics = metricsIdMetrics;
	}

	public Integer getIdMidlevelInformation() {
		return this.idMidlevelInformation;
	}

	public void setIdMidlevelInformation(Integer idMidlevelInformation) {
		this.idMidlevelInformation = idMidlevelInformation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public int getHighlevelIdHighlevel() {
		return this.highlevelIdHighlevel;
	}

	public void setHighlevelIdHighlevel(int highlevelIdHighlevel) {
		this.highlevelIdHighlevel = highlevelIdHighlevel;
	}

	public int getDataContextIdDataContext() {
		return this.dataContextIdDataContext;
	}

	public void setDataContextIdDataContext(int dataContextIdDataContext) {
		this.dataContextIdDataContext = dataContextIdDataContext;
	}

	public int getSensingDataIdSensing() {
		return this.sensingDataIdSensing;
	}

	public void setSensingDataIdSensing(int sensingDataIdSensing) {
		this.sensingDataIdSensing = sensingDataIdSensing;
	}

	public int getSensingDataSensorNodeIdSensorNode() {
		return this.sensingDataSensorNodeIdSensorNode;
	}

	public void setSensingDataSensorNodeIdSensorNode(
			int sensingDataSensorNodeIdSensorNode) {
		this.sensingDataSensorNodeIdSensorNode = sensingDataSensorNodeIdSensorNode;
	}

	public int getMetricsIdMetrics() {
		return this.metricsIdMetrics;
	}

	public void setMetricsIdMetrics(int metricsIdMetrics) {
		this.metricsIdMetrics = metricsIdMetrics;
	}

}
