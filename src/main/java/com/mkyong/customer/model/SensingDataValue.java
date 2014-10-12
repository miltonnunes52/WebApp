package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * SensingDataValue generated by hbm2java
 */
public class SensingDataValue {

	private Integer idSensingDataValue;
	private String valueAddress;
	private String value;
	private int sensingIdSensing;
	private int sensingIdSensorNode;

	public SensingDataValue() {
	}

	public SensingDataValue(int sensingIdSensing, int sensingIdSensorNode) {
		this.sensingIdSensing = sensingIdSensing;
		this.sensingIdSensorNode = sensingIdSensorNode;
	}

	public SensingDataValue(String valueAddress, String value,
			int sensingIdSensing, int sensingIdSensorNode) {
		this.valueAddress = valueAddress;
		this.value = value;
		this.sensingIdSensing = sensingIdSensing;
		this.sensingIdSensorNode = sensingIdSensorNode;
	}

	public Integer getIdSensingDataValue() {
		return this.idSensingDataValue;
	}

	public void setIdSensingDataValue(Integer idSensingDataValue) {
		this.idSensingDataValue = idSensingDataValue;
	}

	public String getValueAddress() {
		return this.valueAddress;
	}

	public void setValueAddress(String valueAddress) {
		this.valueAddress = valueAddress;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getSensingIdSensing() {
		return this.sensingIdSensing;
	}

	public void setSensingIdSensing(int sensingIdSensing) {
		this.sensingIdSensing = sensingIdSensing;
	}

	public int getSensingIdSensorNode() {
		return this.sensingIdSensorNode;
	}

	public void setSensingIdSensorNode(int sensingIdSensorNode) {
		this.sensingIdSensorNode = sensingIdSensorNode;
	}

}
