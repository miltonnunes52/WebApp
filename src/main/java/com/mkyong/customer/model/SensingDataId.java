package com.mkyong.customer.model;

// default package
// Generated 10/Out/2014 16:01:08 by Hibernate Tools 3.6.0

/**
 * SensingDataId generated by hbm2java
 */
public class SensingDataId {

	private int idSensing;
	private int sensorNodeIdSensorNode;

	public SensingDataId() {
	}

	public SensingDataId(int idSensing, int sensorNodeIdSensorNode) {
		this.idSensing = idSensing;
		this.sensorNodeIdSensorNode = sensorNodeIdSensorNode;
	}

	public int getIdSensing() {
		return this.idSensing;
	}

	public void setIdSensing(int idSensing) {
		this.idSensing = idSensing;
	}

	public int getSensorNodeIdSensorNode() {
		return this.sensorNodeIdSensorNode;
	}

	public void setSensorNodeIdSensorNode(int sensorNodeIdSensorNode) {
		this.sensorNodeIdSensorNode = sensorNodeIdSensorNode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SensingDataId))
			return false;
		SensingDataId castOther = (SensingDataId) other;

		return (this.getIdSensing() == castOther.getIdSensing())
				&& (this.getSensorNodeIdSensorNode() == castOther
						.getSensorNodeIdSensorNode());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdSensing();
		result = 37 * result + this.getSensorNodeIdSensorNode();
		return result;
	}

}
